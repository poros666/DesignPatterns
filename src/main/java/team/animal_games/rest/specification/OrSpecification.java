package animal_games.rest.specification;
/**
 * @className: OrSpecification
 * @package animal_games.rest.specification
 * @description: this subclass make the || operation that can return the result which is made by left.isSatisfiedBy || right.isSatisfiedBy
 * @author: Dandelion
 * @date: 2020-11-19 19:43
 * @version: V1.0
*/
public class OrSpecification<T> extends CompositeSpecification<T> {
    private final Specification<T> left;
    private final Specification<T> right;
    /**
     * @className: OrSpecification
     * @description: use the original object and the introduced object to create the OrSpecification
     * @param: [left, right]
     */
    public OrSpecification(Specification<T> left, Specification<T> right) {
        super();
        this.left = left;
        this.right = right;
    }
    /**
     * @methodName: isSatisfiedBy
     * @description: return the result made by left.isSatisfiedBy || right.isSatisfiedBy
     * @param: [o]
     * @return: boolean
     * @throws:
     */
    @Override
    public boolean isSatisfiedBy(T o) {
        return left.isSatisfiedBy(o) || right.isSatisfiedBy(o);
    }
}
