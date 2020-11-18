package animal_games.specification;

public class NotSpecification<T> extends CompositeSpecification<T> {
    private final Specification<T> spec;

    public NotSpecification(Specification<T> spec){
        this.spec = spec;
    }
    //not操作
    @Override
    public boolean isSatisfiedBy(T o) {
        return !spec.isSatisfiedBy(o);
    }
}
