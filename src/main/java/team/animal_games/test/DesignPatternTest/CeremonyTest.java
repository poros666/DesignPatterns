package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.ceremony.*;

public class CeremonyTest {
    public static void main(String args[])
    {
        System.out.println("-------------using proxy，command, and chain of responsibilities at same time-------------");
        System.out.println("------------------------------------prepare something-------------------------------------");
        Position stage=new Position("stage");
        Position n1,n2,n3;
        n1=new Position("normal1");
        n2=new Position("normal2");
        n3=new Position("normal3");
        Host host=new Host("holt");
        host.changePosition(stage);
        Team team1=new Team("team1");
        Team team2=new Team("team2");
        for(int i=0;i<8;i++)
        {
            String n="athlete"+String.valueOf(i);
            Athlete athlete=new Athlete(n);
            team1.addAthlete(athlete);
        }
        for(int i=0;i<8;i++)
        {
            String n="athlete"+String.valueOf(i);
            Athlete athlete=new Athlete(n);
            team2.addAthlete(athlete);
        }
        Leader leader=new Leader("leader1", team1);
        Leader leader1=new Leader("leader2", team2);
        host.showInfo();
        //proxy pattern test
        leader.changePosition(n1);
        leader1.changePosition(n2);
        //leader.showInfo();
        //leader1.showInfo();

        //chain of responsibilities pattern test;

        NormalPositionHandler handler1=new NormalPositionHandler(n1);
        NormalPositionHandler handler2=new NormalPositionHandler(n2);
        NormalPositionHandler handler3=new NormalPositionHandler(n3);
        //handler1.setNext(handler2);
        //handler2.setNext(handler3);
        //handler1.handle(leader);
        //handler1.handle(leader1);

        //command pattern test

        //Perform dance=new Perform("ballet", "team1 dance");
        //dance.addReceiver(team1);
        //host.addCommand(dance);
        //host.giveCommand();

        //cooperation test
        System.out.println("-------------------begin test------------------");
        PositionCommand cp1=new PositionCommand("change team1 to n3");
        cp1.addReceiver(leader);
        cp1.addHandler(handler2);
        cp1.addHandler(handler3);
        host.addCommand(cp1);
        host.giveCommand();
    }
}
