package animal_games.test.DesignPatternTest;

import animal_games.rest.Food.*;


public class FactoryMethodTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Factory Method]Pattern —————————————-------------------------------------————");
        System.out.println("Food : createFood() : " +
                "The abstract method of the factory parent class, the implementation of which is determined by the specific factory subclass that creates the specific Food object.");
        Food meshedPotato= new MeshedPotatoFactory().createFood();
        Food roastMeat= new RoastMeatFactory().createFood();
        Food mealiePizza= new MealiePizzaFactory().createFood();
        System.out.println("---------------------------------");
    }
}
