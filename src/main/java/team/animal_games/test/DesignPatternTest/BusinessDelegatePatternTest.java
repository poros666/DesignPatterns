package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.rebroadcast.Client;
import main.java.team.animal_games.rebroadcast.MatchBusinessDelegate;

public class BusinessDelegatePatternTest {
    public static void main(String[] args) {
        System.out.println("-------------Business Delegate Pattern-------------");
        MatchBusinessDelegate businessDelegate = new MatchBusinessDelegate();//创建代理
        businessDelegate.setServiceType("IQIYI");//设置服务类型
        Client client = new Client(businessDelegate);//创建连接
        client.startMatchService();//看比赛
        businessDelegate.setServiceType("Tencent");//设置服务类型
        client.startMatchService();//看比赛
    }
}
