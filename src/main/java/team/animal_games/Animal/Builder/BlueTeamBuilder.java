package animal_games.Animal.Builder;

import animal_games.Animal.Animal;

public class BlueTeamBuilder implements TeamBuilder {
    private BasketballTeam blueTeam;
    public BlueTeamBuilder(){
        this.blueTeam = new BasketballTeam();
    }
    public void setPG(Animal pg) {
        this.blueTeam.setPG(pg);
    }
    public void setSG(Animal sg) {
        this.blueTeam.setSG(sg);
    }
    public void setSF(Animal sf) {
        this.blueTeam.setSF(sf);
    }
    public void setPF(Animal pf) {
        this.blueTeam.setPF(pf);
    }
    public void setCenter(Animal C) {
        this.blueTeam.setCenter(C);
    }
    public BasketballTeam getResult(){
        System.out.println("这是蓝队的队伍成员：");
        System.out.println(this.blueTeam.toString());
        return blueTeam;
    }
}
