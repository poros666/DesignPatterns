package main.java.team.animal_games.equipment.helmet;


public class BigHelmet extends Helmet {

    public BigHelmet(){
        /**
         * @description: define attribute
         *
         **/
        type = "BigHelmet";
        value= 30;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using Big Helmet!");
    }

}
