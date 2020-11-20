package main.java.team.animal_games.Animal.AbastractFactory;

import animal_games.Animal.Animal;

public abstract class AbstractFactory {
    public abstract Animal createSeaAnimals();
    public abstract Animal createLandAnimals();
    public abstract Animal createSkyAnimals();
}
