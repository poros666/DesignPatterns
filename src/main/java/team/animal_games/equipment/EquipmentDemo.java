package main.java.team.animal_games.equipment;

public class EquipmentDemo {
    private static final String equipment[] =
            {  "White","Green", "Blue", "Red", "Golden" };
    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            double ratio = Math.random();
            Quality equipment = (Quality) EquipmentFactory.getEquipment(getRandomColor(ratio));
            equipment.setPrice(getRandomPrice(ratio));
            equipment.setMult(getRandomMult(ratio));
            equipment.draw();
        }
    }
    private static String getRandomColor(double ratio) {
        return equipment[(int)(ratio*equipment.length)];
    }
    /**
     * @description: create Random Color
     *
     **/
    private static int getRandomPrice(double ratio) {
        return (int)((ratio+1)*Math.random()*100 );
    }
    /**
     * @description: create Random Price
     *
     **/
    private static int getRandomMult(double ratio) {
        return (int)((ratio+1)*Math.random()*1000);
    }
    /**
     * @description: create Random Multiply
     *
     **/
}