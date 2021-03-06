package main.java.team.animal_games.scoreboard;

import java.util.Vector;

//Observer class
public class Observer {

    //observer contains all the scoreboards
    private Vector<Scoreboard> observer;

    public Observer(){
        observer=new Vector<>();
    }
    //add scoreboard into the container
    public void addScoreboard(Scoreboard scoreboard) {
        observer.add(scoreboard);
    }

    //remove scoreboard from the container
    public void remove(Scoreboard scoreboard) {
        observer.remove(scoreboard);
    }

    //notify all the scoreboard in the container
    public void notifyObserver(int day, int[] scores) {
        System.out.println("Observer::notifyObserver()::\"notify all the observers.\"");
        for (Scoreboard scoreboard : observer) {
            scoreboard.response(day, scores);
        }
    }
}
