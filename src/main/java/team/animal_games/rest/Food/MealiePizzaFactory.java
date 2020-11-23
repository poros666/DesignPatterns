package animal_games.rest.Food;

/**
 * @className: MealiePizzaFactory
 * @package animal_games.rest.Food
 * @description: the concrete class which implements the FoodFactory interface to create MealiePizza
 * @author: Dandelion
 * @date: 2020-11-19 18:49
 * @version: V1.0
 */
public class MealiePizzaFactory implements FoodFactory {
    /**
     * @methodName: createFood
     * @description: use the method to create MealiePizza
     * @param: []
     * @return: animal_games.rest.Food.Food
     * @throws:
     */
    @Override
    public Food createFood() {
        System.out.println("MealiePizzaFactory:createFood():具体工厂MealiePizzaFactory的createFood函数，用于创造具体工厂对应的具体食物MealiePizza");
        return new MealiePizza();
    }
}
