package animal_games.rest.Food;

/**
 * @className: RoastMeatFactory
 * @package animal_games.rest.Food
 * @description: the concrete class which implements the FoodFactory interface to create RoastMeat
 * @author: Dandelion
 * @date: 2020-11-19 18:57
 * @version: V1.0
 */
public class RoastMeatFactory implements FoodFactory {
    /**
     * @methodName: createFood
     * @description: use the method to create RoastMeat
     * @param: []
     * @return: animal_games.rest.Food.Food
     * @throws:
     */
    @Override
    public Food createFood() {
        System.out.println("RoastMeatFactory:createFood():具体工厂RoastMeatFactory的createFood函数，用于创造具体工厂对应的具体食物RoastMeat");
        return new RoastMeat();
    }
}
