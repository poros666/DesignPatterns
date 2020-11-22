package main.java.team.animal_games.equipment.clothes;


public class SmallBarbell extends Barbell {

    public SmallBarbell(){
        type = "SmallClothes";
        value= 10;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Small Clothes!");
    }

}
