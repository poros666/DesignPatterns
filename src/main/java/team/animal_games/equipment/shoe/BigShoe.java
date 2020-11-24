package main.java.team.animal_games.equipment.shoe;


public class BigShoe extends Shoe {

    public BigShoe(){
        type = "BigShoe";
        value= 100;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Big Shoe!");
    }

}
