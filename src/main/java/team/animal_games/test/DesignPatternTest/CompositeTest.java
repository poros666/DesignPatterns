package main.java.team.animal_games.test.DesignPatternTest;


import main.java.team.animal_games.award.Award;
import main.java.team.animal_games.award.GroupAward;
import main.java.team.animal_games.award.IndividualAward;
import main.java.team.animal_games.ceremony.Participant;
import main.java.team.animal_games.ceremony.Position;

public class CompositeTest {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------Composite Pattern-------------");
        Participant participant1 = new Participant("cat1");
        Award award1 = new IndividualAward("乒乓球比赛", "金牌", participant1);
        System.out.println(award1);// 个人奖
        Participant participant2 = new Participant("dog1");
        Participant participant3 = new Participant("dog2");
        Participant participant4 = new Participant("dog3");
        Award award2 = new GroupAward("足球比赛", "银牌");
        award2.add(participant2);
        award2.add(participant3);
        award2.add(participant4);
        System.out.println(award2);//团体奖
    }
}
