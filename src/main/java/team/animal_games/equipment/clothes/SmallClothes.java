package main.java.team.animal_games.equipment.clothes;


public class SmallClothes extends Clothes {

    public SmallClothes(){
        type = "SmallClothes";
        value= 10;
    }

    @Override
    public void draw() {
        System.out.println("Now you are using Small Clothes!");
    }

}
