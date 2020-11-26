package main.java.team.animal_games.Animal.AbastractFactory;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.Animal.animals.*;

import java.util.Vector;

public class RacingFactory extends AbstractFactory{
    public RacingFactory(){
        super();
        this.SeaAnimals_species = new Shark().toString() + new Whale().toString();
        this.LandAnimals_species = new Lion().toString() + new Horse().toString();
        this.SkyAnimals_species = new Eagle().toString() + new Seagull().toString();
    }
    public RacingFactory(Vector<Animal> seaAnimals_warehouse, Vector<Animal> landAnimals_warehouse, Vector<Animal> skyAnimals_warehouse){
        super(seaAnimals_warehouse, landAnimals_warehouse, skyAnimals_warehouse);
        this.SeaAnimals_species = new Shark().toString() + new Whale().toString();
        this.LandAnimals_species = new Lion().toString() + new Horse().toString();
        this.SkyAnimals_species = new Eagle().toString() + new Seagull().toString();
    }

    @Override
    public Animal createSeaAnimals(String a) {
        System.out.println("LiftingFactory: createSeaAnimals: add a SeaAnimal to SeaAnimals_warehouse");
        Animal temp;
        switch (a) {
            case "shark" -> temp = new Shark();
            case "whale" -> temp = new Whale();
            default -> temp = new Animal();
        };
        this.SeaAnimals_warehouse.add(temp);
        return temp;
    }

    @Override
    public Animal createLandAnimals(String a) {
        System.out.println("LiftingFactory: createLandAnimals: add a LandAnimal to LandAnimals_warehouse");
        Animal temp;
        switch (a) {
            case "lion" -> temp=new Lion();
            case "horse" -> temp=new Horse();
            default -> temp=new Animal();
        };
        this.LandAnimals_warehouse.add(temp);
        return temp;
    }

    @Override
    public Animal createSkyAnimals(String a) {
        System.out.println("LiftingFactory: createSkyAnimals: add a SkyAnimal to SkyAnimals_warehouse");
        Animal temp;
        switch (a){
            case "eagle" -> temp=new Eagle();
            case "seagull" -> temp=new Seagull();
            default -> temp=new Animal();
        };
        this.SkyAnimals_warehouse.add(temp);
        return temp;
    }
}
