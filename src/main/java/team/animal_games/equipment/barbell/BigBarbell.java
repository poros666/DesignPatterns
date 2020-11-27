package main.java.team.animal_games.equipment.barbell;


public class BigBarbell extends Barbell {

    public BigBarbell (){
        /**
         * @description: define attribute
         *
         **/
        type = "BigBarbell";
        value= 100;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using Big Barbell!");
    }

}
