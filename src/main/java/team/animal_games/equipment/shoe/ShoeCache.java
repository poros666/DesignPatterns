package main.java.team.animal_games.equipment.shoe;

import java.util.Hashtable;

public class ShoeCache {

    private static Hashtable<String, Shoe> ShoeMap
            = new Hashtable<String, Shoe>();

    public static Shoe getId(String barbellId) {
        /**
         * @description: return ID
         *
         **/
        Shoe cachedShoe = ShoeMap.get(barbellId);
        return (Shoe) cachedShoe.clone();
    }

    public static void loadCache() {
        /**
         * @description: initial objects
         *
         **/
        BigShoe bigbarbell = new BigShoe();
        bigbarbell.setId("1");
        ShoeMap.put(bigbarbell.getId(),bigbarbell);
        SmallShoe smallbarbell = new SmallShoe();
        smallbarbell.setId("2");
        ShoeMap.put(smallbarbell.getId(),smallbarbell);
    }
}