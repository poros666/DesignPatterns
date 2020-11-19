package main.java.team.animal_games.competition;

import main.java.team.animal_games.rule.Rules;
import main.java.team.animal_games.situation.Situation;
import main.java.team.animal_games.state.Animal;

import java.util.Map;

public abstract class Competition {
    protected Animal[][] _contestant = new Animal[3][];//参赛队伍固定为三组，每组队伍都是以一个Animal数组
    //protected Stadium _stadium;
    protected Rules _ruleSet;
    protected int date;//比赛举办日期
    protected Situation _situation;
    protected int[] _competitionResult;

    public Competition(){
        //_ruleSet = new Rules();需要 new 吗？？
        _situation = new Situation();
        System.out.println("Competition::Competition()::\"constructor\"");
    }

    public int[] get_competitionResult() {
        return _competitionResult;
    }

    public Animal[][] get_contestant() {
        return _contestant;
    }
    public void set_contestant(Animal[][] _contestant) {
        this._contestant = _contestant;
    }

    public int getDate(){
        return this.date;
    }//获取比赛日期
    public void setDate(int date) {
        this.date = date;
    }

    abstract public int[] getScore();//获取比赛结束后各队获得的积分

    public void startCompetition(){
        System.out.println("Competition::startCompetition()::\"competition started!\"");
        Map<String, Integer> situation = _situation.getSituation();
        System.out.println("本场比赛温度是："+situation.get("temperature")+",能见度是："+situation.get("visibility"));
        System.out.println(" ________  ________  _____ ______   _______   ________  _________  ________  ________  _________  ___       \n" +
                "|\\   ____\\|\\   __  \\|\\   _ \\  _   \\|\\  ___ \\ |\\   ____\\|\\___   ___\\\\   __  \\|\\   __  \\|\\___   ___\\\\  \\      \n" +
                "\\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|\\ \\  \\___|\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\|___ \\  \\_\\ \\  \\     \n" +
                " \\ \\  \\  __\\ \\   __  \\ \\  \\\\|__| \\  \\ \\  \\_|/_\\ \\_____  \\   \\ \\  \\ \\ \\   __  \\ \\   _  _\\   \\ \\  \\ \\ \\  \\    \n" +
                "  \\ \\  \\|\\  \\ \\  \\ \\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\|____|\\  \\   \\ \\  \\ \\ \\  \\ \\  \\ \\  \\\\  \\|   \\ \\  \\ \\ \\__\\   \n" +
                "   \\ \\_______\\ \\__\\ \\__\\ \\__\\    \\ \\__\\ \\_______\\____\\_\\  \\   \\ \\__\\ \\ \\__\\ \\__\\ \\__\\\\ _\\    \\ \\__\\ \\|__|   \n" +
                "    \\|_______|\\|__|\\|__|\\|__|     \\|__|\\|_______|\\_________\\   \\|__|  \\|__|\\|__|\\|__|\\|__|    \\|__|     ___ \n" +
                "                                                \\|_________|                                           |\\__\\\n" +
                "                                                                                                       \\|__|\n" +
                "                                                                                                            ");
    }

    public abstract int[] race();

    public void prizeGiving(){
        System.out.println("Competition::prizeGiving()::\"competition prize giving!\"");
        System.out.println("RANK AS：");
        for(int i=0;i<_competitionResult.length;i++){
            System.out.println("team:"+_competitionResult[i]+" win rank: "+ (i+1) );
        }
    }

    protected int[] getRank(int[] power){
        int[] ans = new int[3];
        ans[0]=ans[1]=ans[2]=0;
        for(int p=0;p<3;p++){
            int max=-999;
            for (int i =0; i < power.length; i++) {

                if (power[i] > max){
                    max = power[i];
                    ans[p] = i;
                }
            }
            power[ans[p]] = -996;
        }
        return ans;
    }

    protected int[] animalPower(){
        int[] power = new int[3];
        int index = 0;
        for(Animal[] team: _contestant){
            int animalPower=0;
            System.out.println("contestant--team"+ index +":");
            for(Animal ani: team){
                ani.showState();
                animalPower += ani.getState().getStateToInt();
            }
            power[index] = animalPower;
            System.out.println("team "+ index +" power is : "+animalPower);
            index++;
        }
        return power;
    }



}
