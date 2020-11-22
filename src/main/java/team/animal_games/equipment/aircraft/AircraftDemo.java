package main.java.team.animal_games.equipment.aircraft;

public class AircraftDemo {
    public static void main(String[] args) {
        AeroCache.loadCache();

        Aircraft aero1 = (Aircraft) AeroCache.getValue("1");
        System.out.println("Aircraft : " + aero1.getType());

        Aircraft aero2 = (Aircraft) AeroCache.getValue("2");
        System.out.println("Aircraft : " + aero2.getType());

        Aircraft aero3 = (Aircraft) AeroCache.getValue("3");
        System.out.println("Aircraft : " + aero3.getType());
    }
}