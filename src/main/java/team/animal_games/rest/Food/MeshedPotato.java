package animal_games.rest.Food;

public class MeshedPotato extends Food{

    public MeshedPotato() {
        this.foodType=FoodType.vegetarian;
        this.energy=100;
        showFood();
    }

    @Override
    public void showFood() {
        System.out.println("factory generate the MeshedPotato");
    }

}
