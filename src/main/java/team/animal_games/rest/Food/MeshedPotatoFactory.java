package animal_games.rest.Food;

public class MeshedPotatoFactory implements FoodFactory{
    @Override
    public Food createFood() {

        return new MeshedPotato();
    }
}
