package animal_games.rest.Dormitory;

/**
 * @className: AquaticDormitory
 * @package animal_games.rest.Dormitory
 * @description:  the subclass of Dormitory that can be instanced to contain the Aquatic animal and can have two kind of style
 * @author: Dandelion
 * @date: 2020-11-19 0:28
 * @version: V1.0
*/
public class AquaticDormitory extends Dormitory {
    /**
     *@className: AquaticDormitory
     *@description: use the specific style to create an AquaticDormitory
     *@author: Dandelion
     *@param: [style]
     */
    public AquaticDormitory(Style style){
        super(style);
        System.out.println("AquaticDormitory:AquaticDormitory(Style style):创建具体Dormitory类，设置类型为Aquatic");
        this.type=DormitoryType.Aquatic;
    }
}
