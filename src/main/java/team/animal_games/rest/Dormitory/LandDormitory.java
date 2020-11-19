package animal_games.rest.Dormitory;

/**
 * @className: LandDormitory
 * @package animal_games.rest.Dormitory
 * @description: the subclass of Dormitory that can be instanced to contain the land animal and can have two kind of style
 * @author: Dandelion
 * @date: 2020-11-19 0:29
 * @version: V1.0
 */
public class LandDormitory extends Dormitory {
    /**
     * @className: LandDormitory
     * @description: use the specific style to create an LandDormitory
     * @author: Dandelion
     * @param: [style]
     */
    public LandDormitory(Style style) {
        super(style);
        this.type = DormitoryType.Land;
    }
}
