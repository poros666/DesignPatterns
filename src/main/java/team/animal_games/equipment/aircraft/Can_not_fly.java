package main.java.team.animal_games.equipment.aircraft;

import main.java.team.animal_games.equipment.aircraft.Aircraft;

public class Can_not_fly extends Aircraft {

    public Can_not_fly(){
        /**
         * @description: define attribute
         *
         **/
        type = "Can_not_fly";
        value= 500;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are playing EVE!");
    }
}
