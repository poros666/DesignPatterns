package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.award.*;
import main.java.team.animal_games.ceremony.Participant;
import main.java.team.animal_games.ceremony.Position;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------Iterator Pattern-------------");
        /**
         * 个人奖
         */
        Participant participant1 = new Participant("cat1");
        Participant participant2 = new Participant("dog2");
        Participant participant3 = new Participant("tiger");
        Participant participant4 = new Participant("cat2");
        Award award1 = new IndividualAward("乒乓球比赛", "金牌", participant1);
        Award award2 = new IndividualAward("羽毛球比赛", "铜牌", participant2);
        Award award3 = new IndividualAward("拳击比赛", "金牌", participant3);
        Award award4 = new IndividualAward("游泳比赛", "银牌", participant4);
        Participant participant5 = new Participant("dog4");
        Participant participant6 = new Participant("dog5");
        Participant participant7 = new Participant("dog6");
        /**
         * 团体奖
         */
        Award award5 = new GroupAward("足球比赛", "银牌");
        award5.add(participant5);
        award5.add(participant6);
        award5.add(participant7);
        /**
         * 创建领奖单
         */
        List<Award> awardList = new ArrayList<>();
        awardList.add(award1);
        awardList.add(award2);
        awardList.add(award3);
        awardList.add(award4);
        awardList.add(award5);
        AwardProcess awardProcess = new AwardProcess(awardList);
        /**
         * 通过设计模式依次领奖
         */
        AwardIterator awardIterator = awardProcess.getIterator();
        while (awardIterator.hasNext()) {
            awardIterator.show();
            awardIterator.next();
            System.out.println();
        }
    }
}
