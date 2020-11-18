package animal_games.specification;

public abstract class CompositeSpecification<T> implements Specification<T>{
    @Override
    public abstract boolean isSatisfiedBy(T o);

    public Specification<T> and(Specification<T> spec) {
        return new AndSpecification<>(this,spec);
    }

    public Specification<T> not() {
        return new NotSpecification<>(this);
    }
    //or操作
    public Specification<T> or(Specification<T> spec) {
        return new OrSpecification<>(this,spec);
    }
}
