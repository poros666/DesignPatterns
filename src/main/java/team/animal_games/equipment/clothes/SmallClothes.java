package main.java.team.animal_games.equipment.clothes;


public class SmallClothes extends Clothes {

    public SmallClothes(){
        /**
         * @description: define attribute
         *
         **/
        type = "SmallClothes";
        value= 50;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using Small Clothes!");
    }

}
