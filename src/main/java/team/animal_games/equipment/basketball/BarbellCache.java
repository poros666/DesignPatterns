package main.java.team.animal_games.equipment.basketball;

import java.util.Hashtable;

public class BarbellCache {

    private static Hashtable<String, Barbell> BarbellMap
            = new Hashtable<String, Barbell>();

    public static Barbell getValue(String barbellId) {
        Barbell cachedAero = BarbellMap.get(barbellId);
        return (Barbell) cachedAero.clone();
    }

    public static void loadCache() {
        BigBarbell bigbarbell = new BigBarbell();
        bigbarbell.setId("1");
        BarbellMap.put(bigbarbell.getId(),bigbarbell);
        SmallBarbell smallbarbell = new SmallBarbell();
        smallbarbell.setId("2");
        BarbellMap.put(smallbarbell.getId(),smallbarbell);
    }
}