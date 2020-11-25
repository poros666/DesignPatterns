package main.java.team.animal_games.equipment.basketball;


public class BigBasketball extends Basketball {

    public BigBasketball(){
        type = "BigBasketball";
        value= 45;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Big Basketball!");
    }

}
