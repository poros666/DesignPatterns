package main.java.team.animal_games.equipment.helmet;

import java.util.Hashtable;

public class HelmetCache {

    private static Hashtable<String, Helmet> HelmetMap
            = new Hashtable<String, Helmet>();

    public static Helmet getId(String barbellId) {
        /**
         * @description: return ID
         *
         **/
        Helmet cachedAero = HelmetMap.get(barbellId);
        return (Helmet) cachedAero.clone();
    }

    public static void loadCache() {
        /**
         * @description: initial objects
         *
         **/
        BigHelmet bigbarbell = new BigHelmet();
        bigbarbell.setId("1");
        HelmetMap.put(bigbarbell.getId(),bigbarbell);
        SmallHelmet smallbarbell = new SmallHelmet();
        smallbarbell.setId("2");
        HelmetMap.put(smallbarbell.getId(),smallbarbell);
    }
}