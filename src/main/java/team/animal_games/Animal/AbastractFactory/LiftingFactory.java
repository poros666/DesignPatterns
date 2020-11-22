package main.java.team.animal_games.Animal.AbastractFactory;

import main.java.team.animal_games.Animal.Animal;
import main.java.team.animal_games.Animal.animals.Cattle;
import main.java.team.animal_games.Animal.animals.Seals;
import main.java.team.animal_games.Animal.animals.Vulture;

public class LiftingFactory extends AbstractFactory{
    @Override
    public Animal createSeaAnimals(int a) {
        return new Vulture();
    }

    @Override
    public Animal createLandAnimals(int a) {
        return new Cattle();
    }

    @Override
    public Animal createSkyAnimals(int a) {
        return new Seals();
    }
}
