package main.java.team.animal_games.equipment.helmet;


public class SmallHelmet extends Helmet {

    public SmallHelmet(){
        type = "SmallBasketball";
        value= 20;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Small Helmet!");
    }

}
