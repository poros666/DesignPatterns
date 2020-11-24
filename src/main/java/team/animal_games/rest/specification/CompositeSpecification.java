package animal_games.rest.specification;
/**
 * @className: CompositeSpecification
 * @package animal_games.rest.specification
 * @description: implement three method and leave one method isSatisfiedBy for the subclass to realize
 * @author: Dandelion
 * @date: 2020-11-19 19:34
 * @version: V1.0
*/
public abstract class CompositeSpecification<T> implements Specification<T> {
    /**
     * @methodName: isSatisfiedBy
     * @description: leave this one for the subclass to realize
     * @param: [o]
     * @return: boolean
     * @throws:
     */
    @Override
    public abstract boolean isSatisfiedBy(T o);
    /**
     * @methodName: and
     * @description: return the result that this class make a && operation with another Specification
     * @param: [spec]
     * @return: animal_games.rest.specification.Specification<T>
     * @throws:
     */
    @Override
    public Specification<T> and(Specification<T> spec) {
        return new AndSpecification<>(this, spec);
    }

    /**
     * @methodName: not
     * @description: return the result that this class make a ! operation with itself
     * @param: []
     * @return: animal_games.rest.specification.Specification<T>
     * @throws:
     */
    @Override
    public Specification<T> not() {
        return new NotSpecification<>(this);
    }
    /**
     * @methodName: or
     * @description: return the result that this class make a || operation with another Specification
     * @param: [spec]
     * @return: animal_games.rest.specification.Specification<T>
     * @throws:
     */
    @Override
    public Specification<T> or(Specification<T> spec) {
        return new OrSpecification<>(this, spec);
    }
}
