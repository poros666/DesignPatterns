package main.java.team.animal_games.Animal.Builder;

import animal_games.Animal.animals.Monkey;
import animal_games.Animal.animals.Panda;


public class TeamDirector {
    private TeamBuilder teamBuilder;

    public TeamDirector(){

    }
    public BasketballTeam constructRedTeam()
    {
        this.teamBuilder = new RedTeamBuilder();
        //构建篮球队
        teamBuilder.setCenter(new Monkey("aa", "Center", "red"));
        teamBuilder.setPF(new Monkey("bb", "PF", "red"));
        teamBuilder.setPG(new Monkey("cc", "PG", "red"));
        teamBuilder.setSF(new Monkey("dd", "SF", "red"));
        teamBuilder.setSG(new Monkey("ee", "SG", "red"));
        return this.teamBuilder.getResult();
    }
    public BasketballTeam constructBlueTeam(){
        this.teamBuilder = new BlueTeamBuilder();
        //构建篮球队
        teamBuilder.setCenter(new Panda("AA","Center", "blue"));
        teamBuilder.setPF(new Panda("BB", "PF", "blue"));
        teamBuilder.setPG(new Panda("CC", "PG", "blue"));
        teamBuilder.setSF(new Panda("DD", "SF", "blue"));
        teamBuilder.setSG(new Panda("EE", "SG", "blue"));
        return this.teamBuilder.getResult();
    }
}
