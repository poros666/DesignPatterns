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
        return this.style.getType();
    }
}
