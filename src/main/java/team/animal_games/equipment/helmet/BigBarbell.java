package main.java.team.animal_games.equipment.helmet;


public class BigBarbell extends Barbell {

    public BigBarbell (){
        type = "BigHelmet";
        value= 100;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Big Helmet!");
    }

}
