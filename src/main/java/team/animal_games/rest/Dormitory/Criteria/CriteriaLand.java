package animal_games.rest.Dormitory.Criteria;

import animal_games.rest.Dormitory.Dormitory;
import animal_games.rest.Dormitory.DormitoryType;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: CriteriaLand
 * @package animal_games.rest.Dormitory.Criteria
 * @description: the concrete Criteria that can return the list of dormitory with Land type
 * @author: Dandelion
 * @date: 2020-11-20 18:43
 * @version: V1.0
 */
public class CriteriaLand implements Criteria {
    /**
     * @methodName: meetCriteria
     * @description: return list with Land type
     * @param: [dormitories]
     * @return: java.util.List<animal_games.rest.Dormitory.Dormitory>
     * @throws:
     */
    @Override
    public List<Dormitory> meetCriteria(List<Dormitory> dormitories) {
        List<Dormitory> newDormitories = new ArrayList<>();
        for (Dormitory dormitory : dormitories) {
            if (dormitory.getType().equals(DormitoryType.Land)) {
                newDormitories.add(dormitory);
            }
        }
        return newDormitories;
    }
}
