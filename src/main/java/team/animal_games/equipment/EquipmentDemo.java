package main.java.team.animal_games.equipment;

public class EquipmentDemo {
    private static final String equipment[] =
            {  "White","Green", "Blue", "Red", "Golden" };
    public static void main(String[] args) {
        for(int i=0; i < 3; ++i) {
            double ratio=Math.random();
            m_equipment equipment = (m_equipment)EquipmentFactory. getEquipment(getRandomColor(ratio));
            equipment.setPrice(getRandomPrice(ratio));
            equipment.setMult(getRandomMult(ratio));
            equipment.draw();
        }
    }
    private static String getRandomColor(double ratio) {
        return equipment[(int)(ratio*equipment.length)];
    }
    private static int getRandomPrice(double ratio) {
        return (int)((ratio+1)*Math.random()*100 );
    }
    private static int getRandomMult(double ratio) {
        return (int)((ratio+1)*Math.random()*1000);
    }
}