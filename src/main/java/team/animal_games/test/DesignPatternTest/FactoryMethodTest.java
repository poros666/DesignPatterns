package animal_games.test.DesignPatternTest;

import animal_games.rest.Food.*;


public class FactoryMethodTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Factory Method]Pattern —————————————-------------------------------------————");
        System.out.println("");
        System.out.println("");
        Food meshedPotato= new MeshedPotatoFactory().createFood();
        Food roastMeat= new RoastMeatFactory().createFood();
        Food mealiePizza= new MealiePizzaFactory().createFood();
        System.out.println("");
        System.out.println("");
        System.out.println("—————————————-------------------------------------————————————————  End —————————————————————————-------------------------------------————");
    }
}
