package main.java.team.animal_games.equipment;
import main.java.team.animal_games.equipment.aircraft.*;


public class DistributeEquipmentDemo {
    private static final String equipment[] =
        {  "White","Green", "Blue", "Purple", "Golden" };
    public static void main(String[] args) {
        AeroCache.loadCache();
        int n = (int)(Math.random()*100 % 3) + 1;
        Aircraft aero= AeroCache.getId("1");
        switch (n) {
            case 1 -> aero = AeroCache.getId("1");
            case 2 -> aero = AeroCache.getId("2");
            case 3 -> aero = AeroCache.getId("3");
            default -> System.out.println("There is no aircraft like that!");
        }
        double ratio=Math.random();
        Quality equipment = (Quality)EquipmentFactory. getEquipment(getRandomColor(ratio));
        equipment.setPrice(getRandomPrice(ratio));
        equipment.setMult(getRandomMult(ratio));
        System.out.println("Aircraft : "+equipment.getQuality() +" "+ aero.getType()+", value : "+aero.getValue()*equipment.getMult()+", Price : "+aero.getValue()*equipment.getPrice());
    }


    private static String getRandomColor(double ratio) {
        return equipment[(int)(ratio*equipment.length)];
    }
    /**
     * @description: create Random Color
     *
     **/
    private static int getRandomPrice(double ratio) {
        return (int)((ratio+0.1)*(Math.random()*10+80) );
    }
    /**
     * @description: create Random Price
     *
     **/
    private static int getRandomMult(double ratio) {
        return (int)((ratio+0.1)*(Math.random()*10+80));
    }
    /**
     * @description: create Random Multiply
     *
     **/
}
