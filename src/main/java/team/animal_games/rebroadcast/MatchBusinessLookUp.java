package main.java.team.animal_games.rebroadcast;

/**
 * find the service
 */
public class MatchBusinessLookUp {
    /**
     *
     * @param serviceType IQIYI or Tencent
     * @return
     */
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("IQIYI")){
            return new IQIYIService();
        }
        else{
            return new TencentService();
        }
    }
}
