package main.java.team.animal_games.rebroadcast;

/**
 * Tencent service for watching match
 */
public class TencentService implements BusinessService{

    @Override
    public void watchMatch() {
        System.out.println("Watch the Match by invoking Tencent Service");
    }
}
