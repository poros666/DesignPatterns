package main.java.team.animal_games.Animal.AbastractFactory;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.Animal.animals.Cattle;
import main.java.team.animal_games.Animal.animals.Seals;
import main.java.team.animal_games.Animal.animals.Vulture;

import java.util.Vector;

public class LiftingFactory extends AbstractFactory{
    /**
     * @description: 默认构造函数，无参数
     */
    public LiftingFactory(){
        super();
        this.SeaAnimals_species = new Vulture().toString();
        this.LandAnimals_species = new Cattle().toString();
        this.SkyAnimals_species = new Seals().toString();
    }

    /**
     * @description: 使用三个动物仓库为参数的构造函数 用于工厂中仓库动物的转移
     */
    public LiftingFactory(Vector<Animal> seaAnimals_warehouse, Vector<Animal> landAnimals_warehouse, Vector<Animal> skyAnimals_warehouse){
        super(seaAnimals_warehouse, landAnimals_warehouse, skyAnimals_warehouse);
        this.SeaAnimals_species = new Vulture().toString();
        this.LandAnimals_species = new Cattle().toString();
        this.SkyAnimals_species = new Seals().toString();
    }

    /**
     * @description: methods extend AbstractFactory
     * @param a string to select animal in RacingFactory
     * @return a animal that be created
     */

    @Override
    public Animal createSeaAnimals(String a) {
        System.out.println("LiftingFactory: createSeaAnimals: add a SeaAnimal to SeaAnimals_warehouse");
        Animal temp = new Vulture();
        this.SeaAnimals_warehouse.add(temp);
        return temp;
    }

    /**
     * @description: methods extend AbstractFactory
     * @param a string to select animal in RacingFactory
     * @return a animal that be created
     */
    @Override
    public Animal createLandAnimals(String a) {
        System.out.println("LiftingFactory: createLandAnimals: add a LandAnimal to LandAnimals_warehouse");
        Animal temp=new Cattle();
        this.LandAnimals_warehouse.add(temp);
        return temp;
    }

    /**
     * @description: methods extend AbstractFactory
     * @param a string to select animal in RacingFactory
     * @return a animal that be created
     */
    @Override
    public Animal createSkyAnimals(String a) {
        System.out.println("LiftingFactory: createSkyAnimals: add a SkyAnimal to SkyAnimals_warehouse");
        Animal temp = new Seals();
        this.SkyAnimals_warehouse.add(temp);
        return temp;
    }
}
