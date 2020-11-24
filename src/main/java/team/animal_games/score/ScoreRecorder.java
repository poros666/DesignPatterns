//author: Lei chen
package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

/*用visitor实现各种比赛的计分规则*/
public interface ScoreRecorder {
    abstract public int[] recordScore(Competition competition);
}
