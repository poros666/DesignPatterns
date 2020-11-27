package main.java.team.animal_games.Animal.Builder;

import main.java.team.animal_games.Animal.animals.Monkey;
import main.java.team.animal_games.Animal.animals.Panda;


public class TeamDirector {
    private TeamBuilder teamBuilder;

    public TeamDirector(){
    }

    /**
     * @description: 初始化TeamDirector中的Builder变量，依照一定步骤构造红队篮球队并返回
     * @return 返回函数所构建的红队篮球队的实体
     */
    public BasketballTeam constructRedTeam()
    {
        System.out.println("TeamDirector: constructRedTeam: create a redTeam for basketballTeam");
        this.teamBuilder = new RedTeamBuilder();
        //构建篮球队
        teamBuilder.setCenter(new Monkey("aa", "Center", "red"));
        teamBuilder.setPF(new Monkey("bb", "PF", "red"));
        teamBuilder.setPG(new Monkey("cc", "PG", "red"));
        teamBuilder.setSF(new Monkey("dd", "SF", "red"));
        teamBuilder.setSG(new Monkey("ee", "SG", "red"));
        return this.teamBuilder.getResult();
    }
    /**
     * @description: 初始化TeamDirector中的Builder变量，依照一定步骤构造蓝队篮球队并返回
     * @return 返回函数所构建的蓝队篮球队的实体
     */
    public BasketballTeam constructBlueTeam(){
        System.out.println("TeamDirector: constructBlueTeam: create a blueTeam for basketballTeam");
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
