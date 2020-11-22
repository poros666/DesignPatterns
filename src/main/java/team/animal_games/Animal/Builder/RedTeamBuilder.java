package main.java.team.animal_games.Animal.Builder;

import main.java.team.animal_games.Animal.Animal;

public class RedTeamBuilder implements TeamBuilder {
    private BasketballTeam redTeam;
    public RedTeamBuilder(){
        this.redTeam = new BasketballTeam();
    }

    @Override
    public void setPG(Animal pg) {
        this.redTeam.setPG(pg);
    }

    @Override
    public void setSG(Animal sg) {
        this.redTeam.setSG(sg);
    }

    @Override
    public void setSF(Animal sf) {
        this.redTeam.setSF(sf);
    }

    @Override
    public void setPF(Animal pf) {
        this.redTeam.setPF(pf);
    }

    @Override
    public void setCenter(Animal C) {
        this.redTeam.setCenter(C);
    }

    @Override
    public BasketballTeam getResult() {
        System.out.println("这是红队的队伍成员：");
        System.out.println(this.redTeam.toString());
        return this.redTeam;
    }
}
