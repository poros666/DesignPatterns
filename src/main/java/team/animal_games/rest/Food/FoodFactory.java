package animal_games.rest.Food;

/**
 * @interfaceName: FoodFactory
 * @package animal_games.rest.Food
 * @description: the interface that show what method FoodFactory should have to create food
 * @author: Dandelion
 * @date: 2020-11-19 18:46
 * @version: V1.0
 */
public interface FoodFactory {
    /**
     * @methodName: createFood
     * @description: the abstract method that will be override by the class
     * @param: []
     * @return: animal_games.rest.Food.Food
     * @throws:
     */
    Food createFood();
}
