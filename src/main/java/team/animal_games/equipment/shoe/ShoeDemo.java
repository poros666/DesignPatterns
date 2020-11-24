package main.java.team.animal_games.equipment.shoe;

public class ShoeDemo {
    public static void main(String[] args) {
        ShoeCache.loadCache();

        Shoe shoe1 = (Shoe) ShoeCache.getId("1");
        System.out.println("Shoe : " + shoe1.getType());

        Shoe shoe2 = (Shoe) ShoeCache.getId("2");
        System.out.println("Shoe : " + shoe2.getType());

    }
}