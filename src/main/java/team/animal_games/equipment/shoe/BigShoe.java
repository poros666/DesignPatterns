package main.java.team.animal_games.equipment.shoe;


public class BigShoe extends Shoe {

    public BigShoe(){
        /**
         * @description: define attribute
         *
         **/
        type = "BigShoe";
        value= 15;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using Big Shoe!");
    }

}
