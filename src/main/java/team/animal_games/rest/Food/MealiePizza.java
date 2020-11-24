package animal_games.rest.Food;

/**
 * @className: MealiePizza
 * @package animal_games.rest.Food
 * @description: the subclass of food that can be instanced to be eaten by animals
 * @author: Dandelion
 * @date: 2020-11-19 0:47
 * @version: V1.0
 */
public class MealiePizza extends Food {
    /**
     * @className: MealiePizza
     * @description: give mealiePizza the foodtype and energy and show that factory generate it
     * @param: []
     */
    public MealiePizza() {
        this.foodType = FoodType.vegetarian;
        this.energy = 200;
        showFood();
    }

    /**
     * @methodName: showFood
     * @description: show that factory generate mealiePizza
     * @param: []
     * @return: void
     * @throws:
     */
    @Override
    public void showFood() {
        System.out.println("factory generate the MealiePizza");
    }
}