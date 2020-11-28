package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.ceremony.Position;
import main.java.team.animal_games.ceremony.Team;
import main.java.team.animal_games.ceremony.Athlete;
import main.java.team.animal_games.ceremony.Leader;


public class ProxyTest {
    public static void main(String args[])
    {
        System.out.println("-------------Proxy Pattern-------------");
        Position n1,n2;
        n1=new Position("normal1");
        n2=new Position("normal2");

        //create a team
        Team team1=new Team("team1");
        //create a team 's members
        for(int i=0;i<8;i++)
        {
            String n="athlete"+String.valueOf(i);
            Athlete athlete=new Athlete(n);
            team1.addAthlete(athlete);
        }
        //create team leader
        Leader leader=new Leader("leader1", team1);
        //proxy pattern test
        //to n1
        leader.changePosition(n1);
        leader.showInfo();
        team1.showInfo();
        //to n2
        leader.changePosition(n2);
        leader.showInfo();
        team1.showInfo();

    }
}
