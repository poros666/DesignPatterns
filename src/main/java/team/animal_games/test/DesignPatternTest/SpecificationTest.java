package animal_games.test.DesignPatternTest;

import animal_games.rest.Food.Food;
import animal_games.rest.Food.FoodType;
import animal_games.rest.Food.MealiePizzaFactory;
import animal_games.rest.specification.EnergyMoreThan;
import animal_games.rest.specification.FoodTypeIs;

public class SpecificationTest {
    public static void main(String[] args) {
        FoodType f = FoodType.meat;
        FoodTypeIs<Food> spec0 = new FoodTypeIs<>(f);
        EnergyMoreThan<Food> spec = new EnergyMoreThan<>(150);
        Food mealiePizza = new MealiePizzaFactory().createFood();
        if (spec0.and(spec).isSatisfiedBy(mealiePizza)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
