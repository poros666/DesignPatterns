package animal_games.rest.Dormitory;

/**
 * @description the class of room with common style
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:36
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonRoomList {
    public List<AirDormitory> airDormitoryList = new ArrayList<>();
    public List<AquaticDormitory> aquaticDormitoryList = new ArrayList<>();
    public List<LandDormitory> landDormitoryList = new ArrayList<>();
    /**
     * @methodName: getDormitoryInfo
     * @description: print the information of dormitory
     * @param: []
     * @return: java.util.HashMap<java.lang.String,java.util.List<java.util.HashMap<java.lang.String,java.lang.String>>>
     * @throws:
     */
    public HashMap<String, List<HashMap<String, String>>> getDormitoryInfo() {
        HashMap<String, List<HashMap<String, String>>> info = new HashMap<>();
        List<HashMap<String, String>> airDormitoryInfo = new ArrayList<>();
        for (AirDormitory airDormitory : airDormitoryList) {
            airDormitoryInfo.add(airDormitory.getDormitoryInfo());
        }
        info.put("AirDormitory", airDormitoryInfo);

        List<HashMap<String, String>> aquaticDormitoryInfo = new ArrayList<>();
        for (AquaticDormitory aquaticDormitory : aquaticDormitoryList) {
            aquaticDormitoryInfo.add(aquaticDormitory.getDormitoryInfo());
        }
        info.put("AquaticDormitory", aquaticDormitoryInfo);

        List<HashMap<String, String>> landDormitoryInfo = new ArrayList<>();
        for (LandDormitory landDormitory : landDormitoryList) {
            landDormitoryInfo.add(landDormitory.getDormitoryInfo());
        }
        info.put("LandDormitory", landDormitoryInfo);
        return info;
    }
    /**
     * @className: CommonRoomList
     * @description: default constructor
     * @param: []
     */
    public  CommonRoomList(){

    }
    /**
     * @className: CommonRoomList
     * @description: construct the list with the dormitory with three types
     * @param: [airDormitoryList, aquaticDormitoryList, landDormitoryList]
     */
    public CommonRoomList(List<AirDormitory> airDormitoryList,List<AquaticDormitory> aquaticDormitoryList,List<LandDormitory> landDormitoryList){
        this.landDormitoryList=landDormitoryList;
        this.airDormitoryList=airDormitoryList;
        this.aquaticDormitoryList=aquaticDormitoryList;
    }
}
