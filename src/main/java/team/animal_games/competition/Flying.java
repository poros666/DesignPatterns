package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;

/**
 * @ClassName Flying
 * @Description subclass of competition, overriding race() and getScore
 * @Author poros
 * @Date 2020/11/24 23:02
 **/
public class Flying extends Competition {

    protected int _distance;//比赛距离

    //constructor
    public Flying() {
        if (Math.random() > 0.5) {
            _distance = 100;
        } else {
            _distance = 1000;
        }
        System.out.println("Flying::Flying()::\"create a " + _distance + " meters flying game!\"");
    }

    //飞行比赛特殊race()
    @Override
    public int[] race() {
        System.out.println("Flying::race()::");
        int[] power = animalPower();
        //tianqi + power =
        int[] ans = getRank(power);
        _competitionResult = ans;
        return ans;
    }

    //飞行比赛特殊getScore()
    @Override
    public int[] getScore(ScoreRecorder scoreRecorder) {
        return scoreRecorder.recordScore(this);
    }
}
