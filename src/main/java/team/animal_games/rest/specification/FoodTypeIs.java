package animal_games.rest.specification;

import animal_games.rest.Food.FoodType;

/**
 * @className: FoodTypeIs
 * @package animal_games.rest.specification
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
        System.out.println("FoodTypeIs<T>:FoodTypeIs(FoodType foodType):FoodTypeIs的创建函数，使用传入的foodType来初始化需要比较的食物类型,foodType是"+foodType);
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
        System.out.println("FoodTypeIs<T>:isSatisfiedBy(T o):" +
                "取得Food对象的食物种类，若种类是"+this.foodType+",则返回true，否则false");
        String[] str = o.toString().split(",");
        return str[0].equals(foodType.toString());
    }

}
