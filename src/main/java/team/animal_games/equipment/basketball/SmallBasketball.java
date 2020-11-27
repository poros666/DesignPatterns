package main.java.team.animal_games.equipment.basketball;


public class SmallBasketball extends Basketball {

    public SmallBasketball(){
        /**
         * @description: define attribute
         *
         **/
        type = "SmallBasketball";
        value= 30;
    }

    @Override
    public void draw() {
        /**
         * @description: override draw()
         *
         **/
        System.out.println("Now you are using Small Basketball!");
    }

}
