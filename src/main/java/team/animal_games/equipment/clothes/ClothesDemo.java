package main.java.team.animal_games.equipment.clothes;

public class ClothesDemo {
    public static void main(String[] args) {
        ClothesCache.loadCache();

        Clothes clothes1 = ClothesCache.getId("1");
        System.out.println("Clothes : " + clothes1.getType());

        Clothes clothes2 = ClothesCache.getId("2");
        System.out.println("Clothes : " + clothes2.getType());

    }
}