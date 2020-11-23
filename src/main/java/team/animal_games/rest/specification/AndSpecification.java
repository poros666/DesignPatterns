package animal_games.rest.specification;
/**
 * @className: AndSpecification
 * @package animal_games.rest.specification
 * @description: this subclass make the && operation that can return the result which is made by left.isSatisfiedBy && right.isSatisfiedBy
 * @author: Dandelion
 * @date: 2020-11-19 19:47
 * @version: V1.0
*/
public class AndSpecification<T> extends CompositeSpecification<T>{
    private final Specification<T> left;
    private final Specification<T> right;
    /**
     * @className: AndSpecification
     * @description: use the original object and the introduced object to create the AndSpecification
     * @param: [left, right]
     */
    public AndSpecification(Specification<T> left, Specification<T> right) {
        super();
        this.left = left;
        this.right = right;
        System.out.println("AndSpecification<T>:AndSpecification(Specification<T> left, Specification<T> right):" +
                "使用传入的两个Specification创建一个新的AndSpecification");
    }
    /**
     * @methodName: isSatisfiedBy
     * @description: return the result made by left.isSatisfiedBy && right.isSatisfiedBy
     * @param: [o]
     * @return: boolean
     * @throws:
     */
    @Override
    public boolean isSatisfiedBy(T o) {
        System.out.println("AndSpecification<T>:isSatisfiedBy(T o):对于传入的o对象分别使用两个规格left,right进行判断，返回两个返回结果的做与操作的结果");
        return left.isSatisfiedBy(o) && right.isSatisfiedBy(o);
    }
}
