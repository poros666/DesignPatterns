package main.java.team.animal_games.Animal.Builder;

import main.java.team.animal_games.Animal.Animal;

public class BlueTeamBuilder implements TeamBuilder {
    private BasketballTeam blueTeam;
    public BlueTeamBuilder(){
        this.blueTeam = new BasketballTeam();
    }
    public void setPG(Animal pg) {
        System.out.println("BlueTeamBuilder: setPG: set a PG for basketballTeam");
        this.blueTeam.setPG(pg);
    }
    public void setSG(Animal sg) {
        System.out.println("BlueTeamBuilder: setPG: set a SG for basketballTeam");
        this.blueTeam.setSG(sg);
    }
    public void setSF(Animal sf) {
        System.out.println("BlueTeamBuilder: setPG: set a SF for basketballTeam");
        this.blueTeam.setSF(sf);
    }
    public void setPF(Animal pf) {
        System.out.println("BlueTeamBuilder: setPG: set a PF for basketballTeam");
        this.blueTeam.setPF(pf);
    }
    public void setCenter(Animal C) {
        System.out.println("BlueTeamBuilder: setPG: set a Center for basketballTeam");
        this.blueTeam.setCenter(C);
    }
    public BasketballTeam getResult(){
        System.out.println("BlueTeamBuilder: getResult: return basketballTeam instance");
        System.out.println("--------------这是蓝队的队伍成员：----------------");
        System.out.println(this.blueTeam.toString());
        return blueTeam;
    }
}
