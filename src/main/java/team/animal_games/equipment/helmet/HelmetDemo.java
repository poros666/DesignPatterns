package main.java.team.animal_games.equipment.helmet;

public class HelmetDemo {
    public static void main(String[] args) {
        HelmetCache.loadCache();

        Helmet helmet1 =HelmetCache.getId("1");
        System.out.println("Helmet : " + helmet1.getType()+", value : "+helmet1.getValue());

        Helmet helmet2 = HelmetCache.getId("2");
        System.out.println("Helmet : " + helmet2.getType()+", value : "+helmet2.getValue());

    }
}