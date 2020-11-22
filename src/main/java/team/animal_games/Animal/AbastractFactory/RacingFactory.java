package main.java.team.animal_games.Animal.AbastractFactory;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.Animal.animals.*;

public class RacingFactory extends AbstractFactory{
    @Override
    public Animal createSeaAnimals(int a) {
        return switch (a) {
            case 1 -> new Shark();
            case 2 -> new Whale();
            default -> new Animal();
        };
    }

    @Override
    public Animal createLandAnimals(int a) {
        return switch (a) {
            case 1 -> new Lion();
            case 2 -> new Horse();
            default -> new Animal();
        };
    }

    @Override
    public Animal createSkyAnimals(int a) {
        return switch (a){
            case 1 -> new Eagle();
            case 2 -> new Seagull();
            default -> new Animal();
        };
    }
}
