package animal_games.rest.Food;

public class RoastMeatFactory implements FoodFactory{
    @Override
    public Food createFood() {
        return new RoastMeat();
    }
}
