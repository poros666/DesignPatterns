package animal_games.specification;

import animal_games.rest.Food.Food;

public class EnergyMoreThan<T> extends CompositeSpecification<T> {

    private final int energy;

    public EnergyMoreThan(int i) {
        this.energy = i;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        String[] str = o.toString().split(",");
        return Integer.parseInt(str[1]) > energy;
    }
}
