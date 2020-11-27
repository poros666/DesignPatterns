//author: Lei chen
package main.java.team.animal_games.score;

import main.java.team.animal_games.competition.Competition;

/*realize the score recorder as visitor*/
public interface ScoreRecorder {
    abstract public int[] recordScore(Competition competition);
}
