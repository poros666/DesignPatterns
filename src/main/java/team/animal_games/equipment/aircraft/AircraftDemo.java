package main.java.team.animal_games.equipment.aircraft;

public class AircraftDemo {
    public static void main(String[] args) {
        AeroCache.loadCache();

        Aircraft aero1 = (Aircraft) AeroCache.getId("1");
        System.out.println("Aircraft : " + aero1.getType()+", value : "+aero1.getValue());

        Aircraft aero2 = (Aircraft) AeroCache.getId("2");
        System.out.println("Aircraft : " + aero2.getType()+", value : "+aero2.getValue());

        Aircraft aero3 = (Aircraft) AeroCache.getId("3");
        System.out.println("Aircraft : " + aero3.getType()+", value : "+aero3.getValue());
    }
}