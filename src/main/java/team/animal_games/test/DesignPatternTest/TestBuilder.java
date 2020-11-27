package main.java.team.animal_games.test.DesignPatternTest;

import main.java.team.animal_games.Animal.Builder.BasketballTeam;
import main.java.team.animal_games.Animal.Builder.TeamDirector;

public class TestBuilder {
    public static void main(String[] arg){
        System.out.println("—————————————-------------------------------------———— Test[Builder]Pattern —————————————-------------------------------------————");
        System.out.println("Follow are (classname: methods: action)！"+'\n');

        System.out.println("TeamDirector: constructRedTeam: create a redTeam for basketballTeam");
        System.out.println("TeamDirector: constructBlueTeam: create a blueTeam for basketballTeam");
        System.out.println("RedTeamBuilder: setPG: set a PG for basketballTeam");
        System.out.println("RedTeamBuilder: setPG: set a SG for basketballTeam");
        System.out.println("RedTeamBuilder: setPG: set a SF for basketballTeam");
        System.out.println("RedTeamBuilder: setPG: set a PF for basketballTeam");
        System.out.println("RedTeamBuilder: getResult: return basketballTeam instance\n");

        System.out.println("--------------------------------------now lets begin creating basketballTeams! -----------------------------------");
        TeamDirector teamDirector = new TeamDirector();
        BasketballTeam blue = teamDirector.constructBlueTeam();
        BasketballTeam red = teamDirector.constructRedTeam();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
