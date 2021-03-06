package main.java.team.animal_games.competition;

import main.java.team.animal_games.score.ScoreRecorder;

/**
 * @ClassName BasketballGame
 * @Description subclass of competition, overriding race() and getScore
 * @Author poros
 * @Date 2020/11/24 23:00
 **/
public class BasketballGame extends Competition {

    //constructor
    public BasketballGame() {
        System.out.println("BasketballGame::BasketballGame()::\" create a basketball game!\"");
    }

    //篮球特殊race()
    @Override
    public int[] race() {
        System.out.println("BasketballGame::race()::");
        int[] power = animalPower();
        //tianqi + power =
        int[] ans = getRank(power);
        _competitionResult = ans;
        return ans;
    }

    //篮球特殊getScore()
    @Override
    public int[] getScore(ScoreRecorder scoreRecorder) {
        return scoreRecorder.recordScore(this);
    }
}
