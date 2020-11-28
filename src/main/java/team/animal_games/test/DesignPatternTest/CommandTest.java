package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.ceremony.*;

public class CommandTest {
    public static void main(String args[]) {
        System.out.println("-------------Command Pattern-------------");
        Position stage = new Position("stage");
        Position n1;
        n1 = new Position("normal1");

        Host host = new Host("holt");
        host.changePosition(stage);
        host.showInfo();

        Team team1 = new Team("team1");

        for (int i = 0; i < 8; i++) {
            String n = "athlete" + String.valueOf(i);
            Athlete athlete = new Athlete(n);
            team1.addAthlete(athlete);
        }

        Leader leader = new Leader("leader1", team1);

        //create some commands
        ChangePosition cp=new ChangePosition(n1,"team1 to n1");
        cp.addReceiver(leader);
        host.addCommand(cp);

        Perform dance=new Perform("ballet", "team1 dance");
        dance.addReceiver(team1);
        host.addCommand(dance);

        //give the commands
        host.giveCommand();
        leader.showInfo();
        team1.showInfo();

        host.giveCommand();



    }
}
