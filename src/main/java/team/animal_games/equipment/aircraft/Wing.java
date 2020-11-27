package main.java.team.animal_games.equipment.aircraft;

import main.java.team.animal_games.equipment.aircraft.Aircraft;

public class Wing extends Aircraft {

    public Wing(){
        /**
         * @description: define attribute
         *
         **/
        type = "Wing";
        value= 50;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using wings!");
    }
}
