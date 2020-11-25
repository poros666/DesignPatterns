package main.java.team.animal_games.rest.specification;

/**
 * @interfaceName: Specification
 * @package animal_games.rest.specification
 * @description: the interface to define four method for CompositeSpecification to realize
 * @author: Dandelion
 * @date: 2020-11-19 19:07
 * @version: V1.0
 */
public interface Specification<T> {
    /**
     * @methodName: isSatisfiedBy
     * @description: to judge the input o satisfy the requirement which will be defined later
     * @param: [o]
     * @return: boolean
     * @throws:
     */
    boolean isSatisfiedBy(T o);

    /**
     * @methodName: and
     * @description: to make the && with another Specification to complete the complex requirement
     * @param: [spec]
     * @return: animal_games.rest.specification.Specification<T>
     * @throws:
     */
    Specification<T> and(Specification<T> spec);

    /**
     * @methodName: not
     * @description: to make the ! with another Specification to complete the complex requirement
     * @param: [spec]
     * @return: animal_games.rest.specification.Specification<T>
     * @throws:
     */
    Specification<T> not();

    /**
     * @methodName: or
     * @description: to make the || with another Specification to complete the complex requirement
     * @param: [spec]
     * @return: animal_games.rest.specification.Specification<T>
     * @throws:
     */
    Specification<T> or(Specification<T> spec);

}
