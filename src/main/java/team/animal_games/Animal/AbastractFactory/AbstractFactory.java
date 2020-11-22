package main.java.team.animal_games.Animal.AbastractFactory;

import main.java.team.animal_games.Animal.Animal;

public abstract class AbstractFactory {
    public abstract Animal createSeaAnimals(int a);
    public abstract Animal createLandAnimals(int a);
    public abstract Animal createSkyAnimals(int a);
}
