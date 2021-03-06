package main.java.team.animal_games.rest.Dormitory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @className: Dormitory
 * @package animal_games.rest.Dormitory
 * @description: the abstract class of Dormitory that the subclass can use it to create itself
 * @author: Dandelion
 * @date: 2020-11-18 23:59
 * @version: V1.0
 */
public abstract class Dormitory {
    protected DormitoryType type;
    public static final int ROON_NUM = 10;
    protected Style style;
    private int dormNumber;
    private List<Room> rooms;
    private StyleType styleType;

    /**
     * @className: Dormitory
     * @description: construct the class with Style (common or luxurious)
     * @author: Dandelion
     * @param: [style]
     */
    public Dormitory(Style style) {
        //public Dormitory(){
        this.style = style;

        rooms = new ArrayList<>();
        createRooms();
        System.out.println("一栋宿舍被创建");
    }

    /**
     * @methodName: getDetails
     * @description: return the string including the information about Dormitory (dormitory type and style type)
     * @author: Dandelion
     * @param: []
     * @return: java.lang.String
     * @throws:
     */
    public String getDetails() {
        return getType() + " Dormitory with " + getStyleType() + "Style Type";
    }

    /**
     * @methodName: getType
     * @description: return the dormitory's type(air,land,aquatic)
     * @param: []
     * @return: animal_games.rest.Dormitory.DormitoryType
     * @throws:
     */
    public DormitoryType getType() {
        return this.getDormitoryType();
    }


    /**
     * @methodName: getDormitoryInfo
     * @description: print the information of dormitory
     * @param: []
     * @return: java.util.HashMap<java.lang.String, java.lang.String>
     * @throws:
     */
    public HashMap<String, String> getDormitoryInfo() {
        HashMap<String, String> dormitoryInfo = new HashMap<>();
        dormitoryInfo.put("DormitoryType", getDormitoryType().toString());
        dormitoryInfo.put("StyleType", getStyleType().toString());
        return dormitoryInfo;
    }

    /**
     * @methodName: getDormitoryType
     * @description: return the type of this.dormitory
     * @param: []
     * @return: animal_games.rest.Dormitory.DormitoryType
     * @throws:
     */
    public DormitoryType getDormitoryType() {
        return this.type;
    }

    /**
     * @methodName: getStyleType
     * @description: return the dormitory's style's type(common,luxurious)
     * @param: []
     * @return: animal_games.rest.Dormitory.StyleType
     * @throws:
     */
    public StyleType getStyleType() {
        return this.style.getType();
    }

    /**
     * @methodName: createRooms
     * @description: create rooms and add them into dormitory
     * @param: []
     * @return: void
     * @throws:
     */
    private void createRooms() {
        RoomFactory roomFactory = new RoomFactory();
        for (int i = 0; i < ROON_NUM; i++) {
            rooms.add(roomFactory.createRoom(i));
        }
    }

    /**
     * @methodName: getRoomById
     * @description: input the roomid and return the room
     * @param: [id]
     * @return: animal_games.rest.Dormitory.Room
     * @throws:
     */
    public Room getRoomById(int id) {
        if (id >= 0 && id < ROON_NUM) {
            return rooms.get(id);
        } else {
            return null;
        }
    }

    /**
     * @methodName: setDormitoryInfo
     * @description: set the type and style type of the dormitory
     * @param: [dormitoryInfo]
     * @return: void
     * @throws:
     */
    public void setDormitoryInfo(HashMap<String, String> dormitoryInfo) {
        for (String key : dormitoryInfo.keySet()) {
            switch (key) {
                case "type": {
                    if (dormitoryInfo.get(key).equals("Air")) {
                        this.type = DormitoryType.Air;
                    } else if (dormitoryInfo.get(key).equals("Aquatic")) {
                        this.type = DormitoryType.Aquatic;
                    } else if (dormitoryInfo.get(key).equals("Land")) {
                        this.type = DormitoryType.Land;
                    }
                    break;
                }
                case "style": {
                    if (dormitoryInfo.get(key).equals("Common")) {
                        this.styleType = StyleType.Common;
                    } else {
                        this.styleType = StyleType.Luxurious;
                    }
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    /**
     * @methodName: setDormNumber
     * @description: set the Dormitory's Number
     * @param: [id]
     * @return: void
     * @throws:
     */
    public void setDormNumber(int id) {
        dormNumber = id;
    }
}
