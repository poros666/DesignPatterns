package main.java.team.animal_games.equipment.clothes;


public class BigBarbell extends Barbell {

    public BigBarbell (){
        type = "BigClothes";
        value= 100;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Big Clothes!");
    }

}
