package main.java.team.animal_games.Animal.Decorator;

/**
 * @author Raven
 */
public class DecoratorTest {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal = new NoWood(animal);
        System.out.println(animal.getDescription() + " and it is worth " + animal.getWorth());
        animal = new WellPrepared(animal);
        System.out.println(animal.getDescription() + " and it is worth " + animal.getWorth());
    }
}
