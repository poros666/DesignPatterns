package animal_games.rest.Food;

/**
 * @className: MeshedPotatoFactory
 * @package animal_games.rest.Food
 * @description: the concrete class which implements the FoodFactory interface to create MealiePizza
 * @author: Dandelion
 * @date: 2020-11-19 18:51
 * @version: V1.0
 */
public class MeshedPotatoFactory implements FoodFactory {
    /**
     * @methodName: createFood
     * @description: use the method to create MeshedPotato
     * @param: []
     * @return: animal_games.rest.Food.Food
     * @throws:
     */
    @Override
    public Food createFood() {
        return new MeshedPotato();
    }
}
