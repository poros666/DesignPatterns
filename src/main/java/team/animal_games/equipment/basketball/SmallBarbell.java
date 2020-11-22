package main.java.team.animal_games.equipment.basketball;


public class SmallBarbell extends Barbell {

    public SmallBarbell(){
        type = "SmallBasketball";
        value= 10;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Small Basketball!");
    }

}
