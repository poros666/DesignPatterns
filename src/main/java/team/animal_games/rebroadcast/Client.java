package main.java.team.animal_games.rebroadcast;

/**
 * client for user
 */
public class Client {
    MatchBusinessDelegate businessDelegate;

    public Client(MatchBusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    /**
     * start match service or watch Match
     */
    public void startMatchService() {
        businessDelegate.startMatchService();
    }
}
