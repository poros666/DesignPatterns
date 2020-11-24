package main.java.team.animal_games.equipment.barbell;


public class SmallBarbell extends Barbell {

    public SmallBarbell(){
        type = "SmallBarbell";
        value= 10;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Small Barbell!");
    }

}
