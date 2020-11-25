package main.java.team.animal_games.rest.Dormitory;
/**
 * @className: Style
 * @package animal_games.rest.Dormitory
 * @description: different dormitory can have different kinds of style, like common and luxurious
 * @author: Dandelion
 * @date: 2020-11-19 0:30
 * @version: V1.0
*/
public abstract class Style {
    protected StyleType styleType;
    /**
     *@methodName: getStyleType
     *@description: return the Style's type
     *@author: Dandelion
     *@param: []
     *@return: animal_games.rest.Dormitory.StyleType
     *@throws:
     */
    public StyleType getType() {
        return styleType;
    }
}
