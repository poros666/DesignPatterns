package main.java.team.animal_games.rebroadcast;

public class MatchBusinessDelegate {
    private MatchBusinessLookUp lookUpService = new MatchBusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    /**
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * watch Match
     */
    public void startMatchService() {
        businessService = lookUpService.getBusinessService(serviceType);
        businessService.watchMatch();
    }
}
