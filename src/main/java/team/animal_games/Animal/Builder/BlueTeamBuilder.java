package main.java.team.animal_games.Animal.Builder;

import main.java.team.animal_games.Animal.Animal;

public class BlueTeamBuilder implements TeamBuilder {
    private BasketballTeam blueTeam;
    public BlueTeamBuilder(){
        this.blueTeam = new BasketballTeam();
    }

    /**
     * @description: 为篮球队设置PG
     * @param pg initial PG
     */
    public void setPG(Animal pg) {
        System.out.println("BlueTeamBuilder: setPG: set a PG for basketballTeam");
        this.blueTeam.setPG(pg);
    }
    /**
     * @description: 为篮球队设置SG
     * @param sg initial SG
     */
    public void setSG(Animal sg) {
        System.out.println("BlueTeamBuilder: setPG: set a SG for basketballTeam");
        this.blueTeam.setSG(sg);
    }
    /**
     * @description: 为篮球队设置SF
     * @param sf initial SF
     */
    public void setSF(Animal sf) {
        System.out.println("BlueTeamBuilder: setPG: set a SF for basketballTeam");
        this.blueTeam.setSF(sf);
    }
    /**
     * @description: 为篮球队设置PF
     * @param pf initial PF
     */
    public void setPF(Animal pf) {
        System.out.println("BlueTeamBuilder: setPG: set a PF for basketballTeam");
        this.blueTeam.setPF(pf);
    }
    /**
     * @description: 为篮球队设置Center
     * @param C initial Center
     */
    public void setCenter(Animal C) {
        System.out.println("BlueTeamBuilder: setPG: set a Center for basketballTeam");
        this.blueTeam.setCenter(C);
    }
    /**
     * @description: 输出这个Builder中篮球队的成员并返回篮球队实体
     * @return BasketballTeam in this Builder
     */
    public BasketballTeam getResult(){
        System.out.println("BlueTeamBuilder: getResult: return basketballTeam instance");
        System.out.println("--------------这是蓝队的队伍成员：----------------");
        System.out.println(this.blueTeam.toString());
        return blueTeam;
    }
}
