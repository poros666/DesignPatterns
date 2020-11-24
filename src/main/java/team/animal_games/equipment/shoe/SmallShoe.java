package main.java.team.animal_games.equipment.shoe;


public class SmallShoe extends Shoe {

    public SmallShoe(){
        type = "SmallShoe";
        value= 10;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Small Shoe!");
    }

}
