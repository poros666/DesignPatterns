package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.equipment.*;

public class FlyweightTest {
    private static void testFlyweight()
    {
        for (int i = 0; i < 5; ++i) {
            double ratio = Math.random();
            Quality equipment = (Quality) EquipmentFactory.getEquipment(getRandomColor(ratio));
            equipment.setPrice(getRandomPrice(ratio));
            equipment.setMult(getRandomMult(ratio));
            equipment.draw();
        }
    }

    private static final String equipment[] = {  "White","Green", "Blue", "Red", "Golden" };
    private static String getRandomColor(double ratio) {
        return equipment[(int)(ratio*equipment.length)];
    }
    private static int getRandomPrice(double ratio) {
        return (int)((ratio+1)*Math.random()*100 );
    }
    private static int getRandomMult(double ratio) {
        return (int)((ratio+1)*Math.random()*1000);
    }

    public static void main(String[] args) {
        System.out.println("—————————————----------------------------------------———— Test[Flyweight]Pattern —————————————----------------------------------------————");
        System.out.println("Quality : Quality : Offer a prototypical instance .");
        System.out.println("Quality : EquipmentFactory : Create new quality only when there is no same one in the hashmap");
        System.out.println("Quality : EquipmentFactory : Using sharing to support large numbers of similar qualities efficiently.");

        System.out.println("—————————————-----------------------------------------------------—————————————————------—-------------------------------------------————");
        testFlyweight();
        System.out.println("—————————————----------------------------------------------------- End ————————————------—-------------------------------------------————");
    }
}
