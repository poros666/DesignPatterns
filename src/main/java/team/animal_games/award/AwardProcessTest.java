package main.java.team.animal_games.award;

import java.util.ArrayList;
import java.util.List;

public class AwardProcessTest {
    public static void main(String[] args) throws Exception {
        Position p1 = new Position("stage");
        Participant participant1 = new Participant(p1, "cat1", 1);
        Participant participant2 = new Participant(p1, "dog2", 1);
        Participant participant3 = new Participant(p1, "tiger", 1);
        Participant participant4 = new Participant(p1, "cat2", 1);
        Award award1 = new IndividualAward("乒乓球比赛", "金牌", participant1);
        Award award2 = new IndividualAward("羽毛球比赛", "铜牌", participant2);
        Award award3 = new IndividualAward("拳击比赛", "金牌", participant3);
        Award award4 = new IndividualAward("游泳比赛", "银牌", participant4);
        Participant participant5 = new Participant(p1, "dog4", 1);
        Participant participant6 = new Participant(p1, "dog5", 1);
        Participant participant7 = new Participant(p1, "dog6", 1);
        Award award5 = new GroupAward("足球比赛", "银牌");
        award5.add(participant5);
        award5.add(participant6);
        award5.add(participant7);
        List<Award> awardList = new ArrayList<>();
        awardList.add(award1);
        awardList.add(award2);
        awardList.add(award3);
        awardList.add(award4);
        awardList.add(award5);
        AwardProcess awardProcess = new AwardProcess(awardList);
        AwardIterator awardIterator = awardProcess.getIterator();
        while (awardIterator.hasNext()) {
            awardIterator.show();
            awardIterator.next();
            System.out.println();
        }
    }
}
