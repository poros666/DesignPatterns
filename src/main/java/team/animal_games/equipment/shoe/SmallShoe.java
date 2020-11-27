package main.java.team.animal_games.equipment.shoe;


public class SmallShoe extends Shoe {

    public SmallShoe(){
        /**
         * @description: define attribute
         *
         **/
        type = "SmallShoe";
        value= 10;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using Small Shoe!");
    }

}
