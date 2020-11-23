package main.java.team.animal_games.scoreboard;

import main.java.team.animal_games.board_marker.Daily;

//scoreboard that only take dailt result in
public class DailyScoreboard extends Scoreboard implements Daily {

    //the day it matches
    private int day;

    //constructor
    public DailyScoreboard(int day) {
        this.day = day;
    }

    //refresh the scoreboard
    @Override
    public void response(int day, int[] scores) {
        if (day == this.day) {
            for (int i = 0; i < 3; i++) {
                scoreboard[i] += scores[i];
            }
        }
    }
}
