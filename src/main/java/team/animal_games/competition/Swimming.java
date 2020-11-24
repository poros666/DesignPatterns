package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;
import main.java.team.animal_games.score.SwimmingRecorder;

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
    public int[] getScore() {
        return new SwimmingRecorder().recordScore(this);
    }
}
