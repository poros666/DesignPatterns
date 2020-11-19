package animal_games.specification;

/**
 * @className: NotSpecification
 * @package animal_games.specification
 * @description: this subclass make the ! operation that can return the opposite result
 * @author: Dandelion
 * @date: 2020-11-19 19:40
 * @version: V1.0
 */
public class NotSpecification<T> extends CompositeSpecification<T> {
    private final Specification<T> spec;

    /**
     * @className: NotSpecification
     * @description: constructor that create a Specification can return an opposite result
     * @param: [spec]
     */
    public NotSpecification(Specification<T> spec) {
        this.spec = spec;
    }

    /**
     * @methodName: isSatisfiedBy
     * @description: return the opposite result of spec
     * @param: [o]
     * @return: boolean
     * @throws:
     */
    @Override
    public boolean isSatisfiedBy(T o) {
        return !spec.isSatisfiedBy(o);
    }
}
