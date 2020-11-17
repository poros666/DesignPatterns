package animal_games.rest.Food;

public class RoastMeat extends Food {
    public RoastMeat() {
        this.foodType=FoodType.meat;
        this.energy=150;
        showFood();
    }

    @Override
    public void showFood() {
        System.out.println("factory generate the RoastMeat");
    }
}
