package main.java.team.animal_games.rebroadcast;

public class Client {
    MatchBusinessDelegate businessDelegate;

    public Client(MatchBusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void startMatchService() {
        businessDelegate.startMatchService();
    }
}
