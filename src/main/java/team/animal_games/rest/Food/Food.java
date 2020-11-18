package animal_games.rest.Food;


public abstract class Food {
    protected FoodType foodType;
    protected int energy;

    public FoodType getFoodType() {
        return foodType;
    }

    public int getEnergy() {
        return energy;
    }

    public abstract void showFood();

    @Override
    public String toString(){
        return foodType+","+energy;
    }
}
