package animal_games.rest.Food;

/**
 * @className: Food
 * @package animal_games.rest.Food
 * @description: the abstract class that describe food by attributes
 * @author: Dandelion
 * @date: 2020-11-19 0:39
 * @version: V1.0
 */
public abstract class Food {
    protected FoodType foodType;
    protected int energy;

    /**
     * @methodName: getFoodType
     * @description: return the foodType of the food
     * @param: []
     * @return: animal_games.rest.Food.FoodType
     * @throws:
     */
    public FoodType getFoodType() {
        return foodType;
    }

    /**
     * @methodName: getEnergy
     * @description: return the energy number of the food
     * @param: []
     * @return: int
     * @throws:
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * @methodName: showFood
     * @description: show the food information, the concrete realization showed in the subclass
     * @param: []
     * @return: void
     * @throws:
     */
    public abstract void showFood();

    /**
     * @methodName: toString
     * @description: rewrite the toString() method that we can use the Object type to get the food information
     * @param: []
     * @return: java.lang.String
     * @throws:
     */
    @Override
    public String toString() {
        return foodType + "," + energy;
    }
}
