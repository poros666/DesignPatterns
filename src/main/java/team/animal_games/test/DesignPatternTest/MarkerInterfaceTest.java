package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.board_marker.Daily;
import main.java.team.animal_games.scoreboard.DailyScoreboard;
import main.java.team.animal_games.scoreboard.TotalScoreboard;

public class MarkerInterfaceTest {
    public static void main(String[] args) {
        System.out.println("Create a daily Scoreboard");
        DailyScoreboard dailyScoreboard=new DailyScoreboard(1);
        System.out.println(dailyScoreboard instanceof Daily);
        TotalScoreboard totalScoreboard=new TotalScoreboard();
        System.out.println(totalScoreboard instanceof Daily);
    }
}
