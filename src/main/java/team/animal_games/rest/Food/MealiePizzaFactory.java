package animal_games.rest.Food;

public class MealiePizzaFactory implements FoodFactory {
    @Override
    public Food createFood() {
        return new MealiePizza();
    }
}
