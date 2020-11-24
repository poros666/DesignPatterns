package main.java.team.animal_games.equipment.basketball;

import java.util.Hashtable;

public class BasketballCache {

    private static Hashtable<String, Basketball> BasketballMap
            = new Hashtable<String, Basketball>();

    public static Basketball getId(String barbellId) {
        Basketball cachedAero = BasketballMap.get(barbellId);
        return (Basketball) cachedAero.clone();
    }

    public static void loadCache() {
        BigBasketball bigbarbell = new BigBasketball();
        bigbarbell.setId("1");
        BasketballMap.put(bigbarbell.getId(),bigbarbell);
        SmallBasketball smallbarbell = new SmallBasketball();
        smallbarbell.setId("2");
        BasketballMap.put(smallbarbell.getId(),smallbarbell);
    }
}