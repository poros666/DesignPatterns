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
        return this.type + " Dormitory with " + this.style.getStyleType() + "Style Type";
    }
}
