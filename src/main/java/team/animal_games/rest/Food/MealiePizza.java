package animal_games.rest.Food;

public class MealiePizza extends Food{
    public MealiePizza(){
        this.foodType=FoodType.vegetarian;
        this.energy=200;
        showFood();
    }
    @Override
    public void showFood() {
        System.out.println("factory generate the MealiePizza");
    }
}