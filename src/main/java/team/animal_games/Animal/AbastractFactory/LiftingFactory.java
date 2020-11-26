package main.java.team.animal_games.Animal.AbastractFactory;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.Animal.animals.Cattle;
import main.java.team.animal_games.Animal.animals.Seals;
import main.java.team.animal_games.Animal.animals.Vulture;

import java.util.Vector;

public class LiftingFactory extends AbstractFactory{
    public LiftingFactory(){
        super();
        this.SeaAnimals_species = new Vulture().toString();
        this.LandAnimals_species = new Cattle().toString();
        this.SkyAnimals_species = new Seals().toString();
    }

    public LiftingFactory(Vector<Animal> seaAnimals_warehouse, Vector<Animal> landAnimals_warehouse, Vector<Animal> skyAnimals_warehouse){
        super(seaAnimals_warehouse, landAnimals_warehouse, skyAnimals_warehouse);
        this.SeaAnimals_species = new Vulture().toString();
        this.LandAnimals_species = new Cattle().toString();
        this.SkyAnimals_species = new Seals().toString();
    }

    @Override
    public Animal createSeaAnimals(String a) {
        System.out.println("LiftingFactory: createSeaAnimals: add a SeaAnimal to SeaAnimals_warehouse");
        Animal temp = new Vulture();
        this.SeaAnimals_warehouse.add(temp);
        return temp;
    }

    @Override
    public Animal createLandAnimals(String a) {
        System.out.println("LiftingFactory: createLandAnimals: add a LandAnimal to LandAnimals_warehouse");
        Animal temp=new Cattle();
        this.LandAnimals_warehouse.add(temp);
        return temp;
    }

    @Override
    public Animal createSkyAnimals(String a) {
        System.out.println("LiftingFactory: createSkyAnimals: add a SkyAnimal to SkyAnimals_warehouse");
        Animal temp = new Seals();
        this.SkyAnimals_warehouse.add(temp);
        return temp;
    }
}
