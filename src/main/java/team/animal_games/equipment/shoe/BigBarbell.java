package main.java.team.animal_games.equipment.shoe;


public class BigBarbell extends Barbell {

    public BigBarbell (){
        type = "BigShoe";
        value= 100;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Big Shoe!");
    }

}
