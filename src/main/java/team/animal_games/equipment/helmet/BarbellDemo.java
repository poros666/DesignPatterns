package main.java.team.animal_games.equipment.helmet;

public class BarbellDemo {
    public static void main(String[] args) {
        BarbellCache.loadCache();

        Barbell barbell1 = (Barbell) BarbellCache.getValue("1");
        System.out.println("Helmet : " + barbell1.getType());

        Barbell barbell2 = (Barbell) BarbellCache.getValue("2");
        System.out.println("Helmet : " + barbell2.getType());

    }
}