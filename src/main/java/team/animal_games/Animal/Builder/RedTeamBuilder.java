package main.java.team.animal_games.Animal.Builder;

import main.java.team.animal_games.Animal.Animal;

public class RedTeamBuilder implements TeamBuilder {
    private BasketballTeam redTeam;
    public RedTeamBuilder(){
        this.redTeam = new BasketballTeam();
    }

    /**
     * @description: 为篮球队设置PG
     * @param pg initial PG
     */
    @Override
    public void setPG(Animal pg) {
        System.out.println("RedTeamBuilder: setPG: set a PG for basketballTeam");
        this.redTeam.setPG(pg);
    }
    /**
     * @description: 为篮球队设置SG
     * @param sg initial SG
     */
    @Override
    public void setSG(Animal sg) {
        System.out.println("RedTeamBuilder: setPG: set a SG for basketballTeam");
        this.redTeam.setSG(sg);
    }
    /**
     * @description: 为篮球队设置SF
     * @param sf initial SF
     */
    @Override
    public void setSF(Animal sf) {
        System.out.println("RedTeamBuilder: setPG: set a SF for basketballTeam");
        this.redTeam.setSF(sf);
    }
    /**
     * @description: 为篮球队设置PF
     * @param pf initial PF
     */
    @Override
    public void setPF(Animal pf) {
        System.out.println("RedTeamBuilder: setPG: set a PF for basketballTeam");
        this.redTeam.setPF(pf);
    }
    /**
     * @description: 为篮球队设置Center
     * @param C initial Center
     */
    @Override
    public void setCenter(Animal C) {
        System.out.println("RedTeamBuilder: setPG: set a Center for basketballTeam");
        this.redTeam.setCenter(C);
    }
    /**
     * @description: 输出这个Builder中篮球队的成员并返回篮球队实体
     * @return BasketballTeam in this Builder
     */
    @Override
    public BasketballTeam getResult() {
        System.out.println("RedTeamBuilder: getResult: return basketballTeam instance");
        System.out.println("--------------这是红队的队伍成员：----------------");
        System.out.println(this.redTeam.toString()+'\n');
        return this.redTeam;
    }
}
