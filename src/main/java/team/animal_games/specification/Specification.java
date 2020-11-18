package animal_games.specification;

public interface Specification<T> {
    boolean isSatisfiedBy(T o);
}
