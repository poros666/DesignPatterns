package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;


public class Flying extends Competition {

    protected int _distance;

    public Flying() {
        if (Math.random() > 0.5) {
            _distance = 100;
        } else {
            _distance = 1000;
        }
        System.out.println("Flying::Flying()::\"create a " + _distance + " meters flying game!\"");
    }

    @Override
    public int[] race() {
        System.out.println("Flying::race()::");
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
