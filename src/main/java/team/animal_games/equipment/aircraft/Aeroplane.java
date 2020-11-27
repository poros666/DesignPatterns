package main.java.team.animal_games.equipment.aircraft;

import main.java.team.animal_games.equipment.aircraft.Aircraft;

public class Aeroplane extends Aircraft {

    public Aeroplane (){
        /**
         * @description: define attribute
         *
         **/
        type = "Aeroplane";
        value= 100;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using Aeroplane!");
    }
}
