package main.java.team.animal_games.award;


public class AwardTest {
    public static void main(String[] args) throws Exception {
        Position p1 = new Position("stage");
        Participant participant1 = new Participant(p1, "cat1", 1);
        Award award1 = new IndividualAward("乒乓球比赛", "金牌", participant1);
        System.out.println(award1);
        Participant participant2 = new Participant(p1, "dog1", 1);
        Participant participant3 = new Participant(p1, "dog2", 1);
        Participant participant4 = new Participant(p1, "dog3", 1);
        Award award2 = new GroupAward("足球比赛", "银牌");
        award2.add(participant2);
        award2.add(participant3);
        award2.add(participant4);
        System.out.println(award2);
    }
}
