package main.java.team.animal_games.equipment.aircraft;

import java.util.Hashtable;

public class AeroCache {

    private static Hashtable<String, Aircraft> aeroMap
            = new Hashtable<String, Aircraft>();

    public static Aircraft getValue(String aeroId) {
        Aircraft cachedAero = aeroMap.get(aeroId);
        return (Aircraft) cachedAero.clone();
    }

    public static void loadCache() {
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.setId("1");
        aeroMap.put(aeroplane.getId(),aeroplane);

        Can_not_fly can_not_fly = new Can_not_fly();
        can_not_fly.setId("2");
        aeroMap.put(can_not_fly.getId(),can_not_fly);

        Wing wing = new Wing();
        wing.setId("3");
        aeroMap.put(wing.getId(),wing);
    }
}