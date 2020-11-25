package main.java.team.animal_games.equipment.barbell;

public class BarbellDemo {
    public static void main(String[] args) {
        BarbellCache.loadCache();

        Barbell barbell1 = BarbellCache.getId("1");
        System.out.println("Barbell : " + barbell1.getType()+", value : "+barbell1.getValue());

        Barbell barbell2 = BarbellCache.getId("2");
        System.out.println("Barbell : " + barbell2.getType()+", value : "+barbell2.getValue());

    }
}