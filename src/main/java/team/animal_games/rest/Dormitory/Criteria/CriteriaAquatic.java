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
        System.out.println("CriteriaAquatic:meetCriteria(List<Dormitory> dormitories):" +
                "返回传入的list中类型为Aquatic的元素组成的新的list");
        List<Dormitory> newDormitories = new ArrayList<>();
        for (Dormitory dormitory : dormitories) {
            if (dormitory.getType().equals(DormitoryType.Aquatic)) {
                newDormitories.add(dormitory);
            }
        }
        return newDormitories;
    }
}
