package animal_games.specification;

import animal_games.rest.Food.FoodType;

/**
 * @className: FoodTypeIs
 * @package animal_games.specification
 * @description: the concrete class that judge the food's type is the specific type
 * @author: Dandelion
 * @date: 2020-11-19 20:03
 * @version: V1.0
 */
public class FoodTypeIs<T> extends CompositeSpecification<T> {
    private final FoodType foodType;

    /**
     * @className: FoodTypeIs
     * @description: set the concrete type
     * @param: [foodType]
     */
    public FoodTypeIs(FoodType foodType) {
        this.foodType = foodType;
    }

    /**
     * @methodName: isSatisfiedBy
     * @description: in class food we override the method toString now it can return "type,energy" we use the first part to compare with this.foodType
     * @param: [o]
     * @return: boolean
     * @throws:
     */
    @Override
    public boolean isSatisfiedBy(T o) {
        String[] str = o.toString().split(",");
        return str[0].equals(foodType.toString());
    }

}
