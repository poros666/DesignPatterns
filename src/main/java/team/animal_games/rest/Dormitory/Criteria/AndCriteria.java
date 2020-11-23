package animal_games.rest.Dormitory.Criteria;

import animal_games.rest.Dormitory.Dormitory;

import java.util.List;

/**
 * @className: AndCriteria
 * @package animal_games.rest.Dormitory.Criteria
 * @description: a concrete criteria to make the intersection of two criteria
 * @author: Dandelion
 * @date: 2020-11-20 18:23
 * @version: V1.0
 */
public class AndCriteria implements Criteria {
    private final Criteria criteria;
    private final Criteria otherCriteria;

    /**
     * @className: AndCriteria
     * @description: initialize the two criteria
     * @param: [criteria, otherCriteria]
     */
    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        System.out.println("AndCriteria:AndCriteria(Criteria criteria, Criteria otherCriteria):" +
                "使用两种criteria创建AndCriteria");
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /**
     * @methodName: meetCriteria
     * @description: to get the result under the two criteria
     * @param: [dormitories]
     * @return: java.util.List<animal_games.rest.Dormitory.Dormitory>
     * @throws:
     */
    @Override
    public List<Dormitory> meetCriteria(List<Dormitory> dormitories) {
        System.out.println("AndCriteria:meetCriteria(List<Dormitory> dormitories):" +
                "传入一个dormitory列表，分别使用类内部的两种criteria过滤取得交集");
        List<Dormitory> firstCriteriaPersons = criteria.meetCriteria(dormitories);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
