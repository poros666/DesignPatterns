package main.java.team.animal_games.equipment.helmet;


public class BigHelmet extends Helmet {

    public BigHelmet(){
        type = "BigHelmet";
        value= 30;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Big Helmet!");
    }

}
