package main.java.team.animal_games.equipment.clothes;

import java.util.Hashtable;

public class ClothesCache {

    private static Hashtable<String, Clothes> ClothesMap
            = new Hashtable<String, Clothes>();

    public static Clothes getId(String barbellId) {
        Clothes cachedAero = ClothesMap.get(barbellId);
        return (Clothes) cachedAero.clone();
    }

    public static void loadCache() {
        BigClothes bigbarbell = new BigClothes();
        bigbarbell.setId("1");
        ClothesMap.put(bigbarbell.getId(),bigbarbell);
        SmallClothes smallbarbell = new SmallClothes();
        smallbarbell.setId("2");
        ClothesMap.put(smallbarbell.getId(),smallbarbell);
    }
}