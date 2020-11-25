package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;

/**
 * @ClassName Swimming
 * @Description subclass of competition, overriding race() and getScore
 * @Author poros
 * @Date 2020/11/24 23:02
 **/
public class Swimming extends Competition {

    protected int _distance;

    public Swimming() {
        if (Math.random() > 0.5) {
            _distance = 100;
        } else {
            _distance = 1000;
        }
        System.out.println("Swimming::Swimming()::\"create a " + _distance + " meters swimming game!\"");
    }

    @Override
    public int[] race() {
        System.out.println("Swimming::race()::");
        int[] power = animalPower();
        //tianqi + power =
        int[] ans = getRank(power);
        _competitionResult = ans;
        return ans;
    }

    @Override
    public int[] getScore(ScoreRecorder scoreRecorder) {
        return scoreRecorder.recordScore(this);
    }
}
