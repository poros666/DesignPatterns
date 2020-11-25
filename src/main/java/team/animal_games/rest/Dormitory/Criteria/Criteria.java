package main.java.team.animal_games.rest.Dormitory.Criteria;

import main.java.team.animal_games.rest.Dormitory.Dormitory;

import java.util.List;

/**
 * @interfaceName: Criteria
 * @package animal_games.rest.Dormitory.Criteria
 * @description: make the criteria interface to be implemented by the concrete criteria
 * @author: Dandelion
 * @date: 2020-11-20 18:21
 * @version: V1.0
 */
public interface Criteria {
    /**
     * @methodName: meetCriteria
     * @description: abstract method that return list with items which meet the criteria
     * @param: [dormitories]
     * @return: java.util.List<animal_games.rest.Dormitory.Dormitory>
     * @throws:
     */
    List<Dormitory> meetCriteria(List<Dormitory> dormitories);
}
