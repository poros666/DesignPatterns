package animal_games.rest.Food;

/**
 * @className: RoastMeat
 * @package animal_games.rest.Food
 * @description: the subclass of food that can be instanced to be eaten by animals
 * @author: Dandelion
 * @date: 2020-11-19 18:45
 * @version: V1.0
 */
public class RoastMeat extends Food {
    /**
     * @className: RoastMeat
     * @description: give RoastMeat the foodtype and energy and show that factory generate it
     * @param: []
     */
    public RoastMeat() {
        this.foodType = FoodType.meat;
        this.energy = 150;
        showFood();
    }

    /**
     * @methodName: showFood
     * @description: show that factory generate RoastMeat
     * @param: []
     * @return: void
     * @throws:
     */
    @Override
    public void showFood() {
        System.out.println("factory generate the RoastMeat");
    }
}
