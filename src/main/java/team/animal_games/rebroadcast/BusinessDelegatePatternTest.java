package main.java.team.animal_games.rebroadcast;

public class BusinessDelegatePatternTest {
    public static void main(String[] args) {
        MatchBusinessDelegate businessDelegate = new MatchBusinessDelegate();
        businessDelegate.setServiceType("IQIYI");
        Client client = new Client(businessDelegate);
        client.startMatchService();
        businessDelegate.setServiceType("Tencent");
        client.startMatchService();
    }
}
