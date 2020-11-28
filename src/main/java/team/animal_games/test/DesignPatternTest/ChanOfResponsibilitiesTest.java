package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.ceremony.*;

public class ChanOfResponsibilitiesTest {
    public static void main(String args[]) {
        System.out.println("-------------Chan of Responsibilities Pattern-------------");

        Position n1, n2, n3;
        n1 = new Position("normal1");
        n2 = new Position("normal2");
        n3 = new Position("normal3");

        //create two team to make sure one position is not enough
        Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        for (int i = 0; i < 8; i++) {
            String n = "athlete" + String.valueOf(i);
            Athlete athlete = new Athlete(n);
            team1.addAthlete(athlete);
        }

        for (int i = 0; i < 8; i++) {
            String n = "athlete" + String.valueOf(i);
            Athlete athlete = new Athlete(n);
            team2.addAthlete(athlete);
        }
        Leader leader = new Leader("leader1", team1);
        Leader leader1 = new Leader("leader2", team2);

        //create handlers
        NormalPositionHandler handler1 = new NormalPositionHandler(n1);
        NormalPositionHandler handler2 = new NormalPositionHandler(n2);
        NormalPositionHandler handler3 = new NormalPositionHandler(n3);
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        //handling
        handler1.handle(leader);
        handler1.handle(leader1);
    }
}
