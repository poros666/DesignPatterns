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
        System.out.println("Specification<T>:and(Specification<T> spec):规格模式的and函数，用于使用两个规格创建一个AndSpecification<>类");
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
        System.out.println("Specification<T>:not():规格模式的not函数，用于使用当前的this的规格创建一个NotSpecification<>类");
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
        System.out.println("Specification<T>:or(Specification<T> spec):规格模式的or函数，用于使用两个规格创建一个OrSpecification<>类");
        return new OrSpecification<>(this, spec);
    }
}
