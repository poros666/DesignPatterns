package animal_games.test.DesignPatternTest;

import animal_games.rest.Food.Food;
import animal_games.rest.Food.MealiePizza;
import animal_games.rest.Food.MealiePizzaFactory;
import animal_games.specification.EnergyMoreThan;

public class SpecificationTest {
    public static void main(String[] args) {
        EnergyMoreThan<Food> spec = new EnergyMoreThan<>(150);
        Food mealiePizza = new MealiePizzaFactory().createFood();
        if (spec.isSatisfiedBy(mealiePizza)) {
            System.out.println("yes");
        }
    }
}
