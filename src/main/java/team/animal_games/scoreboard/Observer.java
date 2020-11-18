package main.java.team.animal_games.scoreboard;

import java.util.Vector;

public class Observer {
    private Vector<Scoreboard> observer;
    public void addScoreboard(Scoreboard scoreboard)
    {
        observer.add(scoreboard);
    }
    public void remove(Scoreboard scoreboard)
    {
        observer.remove(scoreboard);
    }
    public void notifyObserver(int day,int[]scores){
        for(Scoreboard scoreboard:observer)
        {
            scoreboard.response(day,scores);
        }
    }
}
