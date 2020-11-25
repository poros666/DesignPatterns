package main.java.team.animal_games.rest.Dormitory.Criteria;

import main.java.team.animal_games.rest.Dormitory.Dormitory;
import main.java.team.animal_games.rest.Dormitory.StyleType;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: CriteriaCommon
 * @package animal_games.rest.Dormitory.Criteria
 * @description: the concrete Criteria that can return the list of dormitory with common style
 * @author: Dandelion
 * @date: 2020-11-20 18:41
 * @version: V1.0
 */
public class CriteriaCommon implements Criteria {
    /**
     * @methodName: meetCriteria
     * @description: return list with common style
     * @param: [dormitories]
     * @return: java.util.List<animal_games.rest.Dormitory.Dormitory>
     * @throws:
     */
    @Override
    public List<Dormitory> meetCriteria(List<Dormitory> dormitories) {

        List<Dormitory> newDormitories = new ArrayList<>();
        for (Dormitory dormitory : dormitories) {
            if (dormitory.getStyleType().equals(StyleType.Common)) {
                newDormitories.add(dormitory);
            }
        }
        return newDormitories;
    }
}
