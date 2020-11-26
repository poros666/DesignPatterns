package main.java.team.animal_games.Animal.Builder;

import main.java.team.animal_games.Animal.Animal;

public class RedTeamBuilder implements TeamBuilder {
    private BasketballTeam redTeam;
    public RedTeamBuilder(){
        this.redTeam = new BasketballTeam();
    }

    @Override
    public void setPG(Animal pg) {
        System.out.println("RedTeamBuilder: setPG: set a PG for basketballTeam");
        this.redTeam.setPG(pg);
    }

    @Override
    public void setSG(Animal sg) {
        System.out.println("RedTeamBuilder: setPG: set a SG for basketballTeam");
        this.redTeam.setSG(sg);
    }

    @Override
    public void setSF(Animal sf) {
        System.out.println("RedTeamBuilder: setPG: set a SF for basketballTeam");
        this.redTeam.setSF(sf);
    }

    @Override
    public void setPF(Animal pf) {
        System.out.println("RedTeamBuilder: setPG: set a PF for basketballTeam");
        this.redTeam.setPF(pf);
    }

    @Override
    public void setCenter(Animal C) {
        System.out.println("RedTeamBuilder: setPG: set a Center for basketballTeam");
        this.redTeam.setCenter(C);
    }

    @Override
    public BasketballTeam getResult() {
        System.out.println("RedTeamBuilder: getResult: return basketballTeam instance");
        System.out.println("--------------这是红队的队伍成员：----------------");
        System.out.println(this.redTeam.toString()+'\n');
        return this.redTeam;
    }
}
