package animal_games.rest.Dormitory;

/**
 * @className: Dormitory
 * @package animal_games.rest.Dormitory
 * @description: the abstract class of Dormitory that the subclass can use it to create itself
 * @author: Dandelion
 * @date: 2020-11-18 23:59
 * @version: V1.0
 */
public abstract class Dormitory {
    protected DormitoryType type;
    protected Style style;


    /**
     * @className: Dormitory
     * @description: construct the class with Style (common or luxurious)
     * @author: Dandelion
     * @param: [style]
     */
    public Dormitory(Style style) {
        System.out.println("Dormitory:Dormitory(Style style):Dormitory的构造函数，使用Style初始化Style");
        this.style = style;
    }

    /**
     * @methodName: getDetails
     * @description: return the string including the information about Dormitory (dormitory type and style type)
     * @author: Dandelion
     * @param: []
     * @return: java.lang.String
     * @throws:
     */
    public String getDetails() {
        System.out.println("Dormitory:getDetails():返回Dormitory的类型和Style类型");
        return this.type + " Dormitory with " + this.style.getType() + "Style Type";
    }

    /**
     * @methodName: getType
     * @description: return the dormitory's type(air,land,aquatic)
     * @param: []
     * @return: animal_games.rest.Dormitory.DormitoryType
     * @throws:
     */
    public DormitoryType getType(){
        System.out.println("Dormitory:getType():返回Dormitory的类型");
        return this.type;
    }

    /**
     * @methodName: getStyleType
     * @description: return the dormitory's style's type(common,luxurious)
     * @param: []
     * @return: animal_games.rest.Dormitory.StyleType
     * @throws:
     */
    public StyleType getStyleType(){
        System.out.println("Dormitory:getStyleType():返回Dormitory的Style类型");
        return this.style.getType();
    }
}
