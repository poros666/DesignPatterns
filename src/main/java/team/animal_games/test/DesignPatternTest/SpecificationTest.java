package animal_games.test.DesignPatternTest;

import animal_games.rest.Food.Food;
import animal_games.rest.Food.FoodType;
import animal_games.rest.Food.MealiePizzaFactory;
import animal_games.rest.specification.EnergyMoreThan;
import animal_games.rest.specification.FoodTypeIs;

public class SpecificationTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Specification]Pattern —————————————-------------------------------------————");
        System.out.println("");
        System.out.println("");


        Food mealiePizza = new MealiePizzaFactory().createFood();
        System.out.println("MealiePizza:toString():创建出来的食物属性是："+mealiePizza.toString());
        FoodTypeIs<Food> foodTypeIsMeat = new FoodTypeIs<>(FoodType.meat);
        EnergyMoreThan<Food> energyMoreThan150 = new EnergyMoreThan<>(150);
        if (foodTypeIsMeat.or(energyMoreThan150).isSatisfiedBy(mealiePizza)) {
            System.out.println("食物是否是能量大于150或者是肉类，判断的结果是：true");
        } else {
            System.out.println("食物是否是能量大于150或者是肉类，判断的结果是：false");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
