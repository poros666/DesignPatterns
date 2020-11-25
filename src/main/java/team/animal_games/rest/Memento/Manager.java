package animal_games.rest.Memento;

import animal_games.rest.Dormitory.*;

import java.util.HashMap;
import java.util.List;

/**
 * @program: AnimalGames
 * @description: manager: Originator in Memento pattern
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 19:54
 */ 

public class Manager {
    //Leader leader;
    private CommonRoomList commonRoomList = new CommonRoomList();
    private LuxuriousRoomList luxuriousRoomList=new LuxuriousRoomList();
    private BookingRecords emptyRecords;
    private CommonStyle commonStyle=new CommonStyle();
    private LuxuriousStyle luxuriousStyle=new LuxuriousStyle();
    //public void setTeamLeader(TeamLeader teamLeader){ this.teamLeader=teamLeader;}

    //public RoomList getRoomList(){return roomList;}
// It is used to restore the historical state
    public void updateCommonRoomList(CommonRoomList commonRoomList){this.commonRoomList=commonRoomList;}
    public void updateLuxuriousRoomList(LuxuriousRoomList luxuriousRoomList){this.luxuriousRoomList=luxuriousRoomList;}
    //Book the room and create a memento

    /**
     * @description bookRoom:to create a room's booking
     * @params [DormitoryType, StyleType] 
     * @author dabao
     * @date 2020/11/24 23:24 
     * @return animal_games.rest.Memento.BookingRecords
     */
    public BookingRecords bookRoom(String DormitoryType, String StyleType) {
        HashMap<String, List<HashMap<String, String>>> dormitoryInfo = new HashMap<>();
        //dormitoryInfo=commonRoomList.getDormitoryInfo();
        //dormitoryInfo=luxuriousRoomList.getDormitoryInfo();
        if (DormitoryType.equals("AIR")) {
            if (StyleType.equals("Common")) {
                AirDormitory airDormitory = new AirDormitory(commonStyle);
                commonRoomList.airDormitoryList.add(airDormitory);
                dormitoryInfo=commonRoomList.getDormitoryInfo();
            } else {
                AirDormitory airDormitory = new AirDormitory(luxuriousStyle);
                luxuriousRoomList.airDormitoryList.add(airDormitory);
                dormitoryInfo=luxuriousRoomList.getDormitoryInfo();
            }
            return new BookingRecords("AIR", BookingRecords.LiveOrLeave.LIVE,
                    StyleType, dormitoryInfo);
        } else if (DormitoryType.equals("aquatic")) {
            if (StyleType.equals("Common")) {

                AquaticDormitory aquaticDormitory = new AquaticDormitory(commonStyle);
                commonRoomList.aquaticDormitoryList.add(aquaticDormitory);
                dormitoryInfo=commonRoomList.getDormitoryInfo();
            } else {
                AquaticDormitory aquaticDormitory = new AquaticDormitory(luxuriousStyle);
                luxuriousRoomList.aquaticDormitoryList.add(aquaticDormitory);
                dormitoryInfo=luxuriousRoomList.getDormitoryInfo();
            }
            return new BookingRecords("aquatic", BookingRecords.LiveOrLeave.LIVE,
                    StyleType, dormitoryInfo);
        } else if (DormitoryType.equals("LAND")) {
            {
                if (StyleType.equals("Common")) {
                    LandDormitory landDormitory = new LandDormitory(commonStyle);
                    commonRoomList.landDormitoryList.add(landDormitory);
                    dormitoryInfo=commonRoomList.getDormitoryInfo();
                } else {
                    LandDormitory landDormitory = new LandDormitory(luxuriousStyle);
                    luxuriousRoomList.landDormitoryList.add(landDormitory);
                    dormitoryInfo=luxuriousRoomList.getDormitoryInfo();
                }
                return new BookingRecords("Land", BookingRecords.LiveOrLeave.LIVE,
                        StyleType, dormitoryInfo);
            }
        }
        return emptyRecords;
    }
/**
 * @description cancelRoom:to cancel a room' booking
 * @params [DormitoryType, StyleType]
 * @author dabao
 * @date 2020/11/24 23:25
 * @return animal_games.rest.Memento.BookingRecords
 */
    //Cancel a room and create a memento
    public BookingRecords cancelRoom(String DormitoryType, String StyleType) {
        HashMap<String, List<HashMap<String, String>>> dormitoryInfo = new HashMap<>();
        //dormitoryInfo=commonRoomList.getDormitoryInfo();
        dormitoryInfo=luxuriousRoomList.getDormitoryInfo();

        if (DormitoryType.equals("AIR")) {
            int i=commonRoomList.airDormitoryList.size()-1;
            if (StyleType.equals("Common")) {

                commonRoomList.airDormitoryList.remove(i);
            } else {

                luxuriousRoomList.airDormitoryList.remove(i);
            }
            return new BookingRecords("AIR", BookingRecords.LiveOrLeave.LEAVE,
                    StyleType, dormitoryInfo);
        } else if (DormitoryType.equals("aquatic")) {
            int i=commonRoomList.aquaticDormitoryList.size();
            if (StyleType.equals("Common")) {
                commonRoomList.aquaticDormitoryList.remove(i);
            } else {
                luxuriousRoomList.aquaticDormitoryList.remove(i);
            }
            return new BookingRecords("aquatic",BookingRecords.LiveOrLeave.LIVE,
                    StyleType,dormitoryInfo);
        } else if (DormitoryType.equals("LAND")) {
            int i=commonRoomList.landDormitoryList.size();
            {
                if (StyleType.equals("Common")) {
                    commonRoomList.landDormitoryList.remove(i);
                } else {

                    luxuriousRoomList.landDormitoryList.remove(i);
                    return new BookingRecords("Land", BookingRecords.LiveOrLeave.LIVE,
                            StyleType, dormitoryInfo);
                }
            }
        }
        return  emptyRecords;
    }
    /**
     * @description restoreRecords:restore the manage records
     * @params [manageRecords, num]
     * @author dabao
     * @date 2020/11/24 23:26
     * @return void
     */
    public void restoreRecords(ManageRecords manageRecords, int num) {
        BookingRecords bookingRecords = manageRecords.getBookingRecords().get(num);
        CommonRoomList commonRoomList = new CommonRoomList();
        LuxuriousRoomList luxuriousRoomList=new LuxuriousRoomList();
        HashMap<String, List<HashMap<String, String>>> dormitoryInfo = bookingRecords.getDormitoryInfo();
        for (String key : dormitoryInfo.keySet()) {
            List<HashMap<String, String>> value = dormitoryInfo.get(key);
            switch (key) {
                case "AirDormitory": {
                    for (HashMap<String, String> dormitoryHashMap : value) {
                        AirDormitory airDormitory = new AirDormitory(commonStyle);
                        airDormitory.setDormitoryInfo(dormitoryHashMap);
                        commonRoomList.airDormitoryList.add(airDormitory);
                    }
                    break;
                }
            }
        }
    }
}

