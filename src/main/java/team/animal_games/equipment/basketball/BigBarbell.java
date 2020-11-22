package main.java.team.animal_games.equipment.basketball;


public class BigBarbell extends Barbell {

    public BigBarbell (){
        type = "BigBasketball";
        value= 100;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Big Basketball!");
    }

}
