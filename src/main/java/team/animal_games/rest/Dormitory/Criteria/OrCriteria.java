package animal_games.rest.Dormitory.Criteria;

import animal_games.rest.Dormitory.Dormitory;

import java.util.List;

/**
 * @className: OrCriteria
 * @package animal_games.rest.Dormitory.Criteria
 * @description: a concrete criteria to make the union of two criteria
 * @author: Dandelion
 * @date: 2020-11-20 18:34
 * @version: V1.0
 */
public class OrCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    /**
     * @className: OrCriteria
     * @description: initialize the two criteria
     * @param: [criteria, otherCriteria]
     */
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * @methodName: meetCriteria
     * @description: to get the result under one criteria or another
     * @param: [dormitories]
     * @return: java.util.List<animal_games.rest.Dormitory.Dormitory>
     * @throws:
     */
    @Override
    public List<Dormitory> meetCriteria(List<Dormitory> dormitories) {
        List<Dormitory> firstCriteriaItems = criteria.meetCriteria(dormitories);
        List<Dormitory> otherCriteriaItems = otherCriteria.meetCriteria(dormitories);

        for (Dormitory dormitory : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(dormitory)) {
                firstCriteriaItems.add(dormitory);
            }
        }
        return firstCriteriaItems;
    }
}
