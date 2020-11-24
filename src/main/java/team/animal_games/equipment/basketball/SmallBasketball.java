package main.java.team.animal_games.equipment.basketball;


public class SmallBasketball extends Basketball {

    public SmallBasketball(){
        type = "SmallBasketball";
        value= 10;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Small Basketball!");
    }

}
