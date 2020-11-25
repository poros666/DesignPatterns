package main.java.team.animal_games.rest.Dormitory;

/**
 * @className: AirDormitory
 * @package animal_games.rest.Dormitory
 * @description: the subclass of Dormitory that can be instanced to contain the flying animal and can have two kind of style
 * @author: Dandelion
 * @date: 2020-11-19 0:25
 * @version: V1.0
 */
public class AirDormitory extends Dormitory {
    /**
     * @className: AirDormitory
     * @description: use the specific style to create an airDormitory
     * @author: Dandelion
     * @param: [style]
     */
    public AirDormitory(Style style) {
        super(style);
        this.type = DormitoryType.Air;
    }

}

