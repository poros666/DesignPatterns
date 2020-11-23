package animal_games.rest.specification;

/**
 * @className: NotSpecification
 * @package animal_games.rest.specification
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
        super();
        this.spec = spec;
        System.out.println("NotSpecification<T>:NotSpecification(Specification<T> spec):" +
                "使用传入的Specification创建一个新的NotSpecification");
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
        System.out.println("NotSpecification<T>:isSatisfiedBy(T o):对于传入的o对象分别使用spec规格判断，返回其值的取反");
        return !spec.isSatisfiedBy(o);
    }
}
