package main.java.team.animal_games.equipment.barbell;

public class BarbellDemo {
    public static void main(String[] args) {
        BarbellCache.loadCache();

        Barbell barbell1 = (Barbell) BarbellCache.getId("1");
        System.out.println("Barbell : " + barbell1.getType());

        Barbell barbell2 = (Barbell) BarbellCache.getId("2");
        System.out.println("Barbell : " + barbell2.getType());

    }
}