package main.java.team.animal_games.equipment;

import java.util.HashMap;

public class EquipmentFactory {
    private static final HashMap<String, Equipment> equipMap = new HashMap<>();

    public static Equipment getEquipment(String quality) {
        m_equipment equipment = (m_equipment)equipMap.get(quality);
        if(equipment == null) {
            equipment = new m_equipment(quality);
            equipMap.put(quality, equipment);
            System.out.println("You got a new quality : " + quality+" !");
        }
        return equipment;
        }
    }
