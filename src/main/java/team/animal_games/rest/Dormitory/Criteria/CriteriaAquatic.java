package animal_games.rest.Dormitory.Criteria;

import animal_games.rest.Dormitory.Dormitory;
import animal_games.rest.Dormitory.DormitoryType;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: CriteriaAquatic
 * @package animal_games.rest.Dormitory.Criteria
 * @description: the concrete Criteria that can return the list of dormitory with Aquatic type
 * @author: Dandelion
 * @date: 2020-11-20 18:44
 * @version: V1.0
 */
public class CriteriaAquatic implements Criteria {
    /**
     * @methodName: meetCriteria
     * @description: return list with Aquatic Type
     * @param: [dormitories]
     * @return: java.util.List<animal_games.rest.Dormitory.Dormitory>
     * @throws:
     */
    @Override
    public List<Dormitory> meetCriteria(List<Dormitory> dormitories) {
        List<Dormitory> newDormitories = new ArrayList<>();
        for (Dormitory dormitory : dormitories) {
            if (dormitory.getDormitoryType().equals(DormitoryType.Aquatic)) {
                newDormitories.add(dormitory);
            }
        }
        return newDormitories;
    }
}
