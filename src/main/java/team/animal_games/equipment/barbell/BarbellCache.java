package main.java.team.animal_games.equipment.barbell;

import java.util.Hashtable;

public class BarbellCache {

    private static Hashtable<String, Barbell> BarbellMap
            = new Hashtable<String, Barbell>();

    public static Barbell getValue(String barbellId) {
        Barbell cachedBarbell = BarbellMap.get(barbellId);
        return (Barbell) cachedBarbell.clone();
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