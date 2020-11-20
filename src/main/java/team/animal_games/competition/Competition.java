package main.java.team.animal_games.competition;

import main.java.team.animal_games.rule.Rules;
import main.java.team.animal_games.situation.Situation;
import main.java.team.animal_games.state.Animal;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public abstract class Competition {
    protected Animal[][] _contestant = new Animal[3][];//参赛队伍固定为三组，每组队伍都是以一个Animal数组
    //protected Stadium _stadium;
    protected Rules _ruleSet;
    protected int _date;//比赛举办日期
    protected Situation _situation;//状况，包含天气和时间，会影响温度和能见度
    protected int[] _competitionResult;//比赛结果，一个长度为3的数组包含本比赛的三支参赛队伍的排名 _competitionResult[0]=1 代表队伍1得第一

    public Competition() {
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

    public int getDate() {
        return this._date;
    }

    public void setDate(int date) {
        this._date = date;
    }

    abstract public int[] getScore();//获取比赛结束后各队获得的积分(使用时请区别于 排名 )

    //模拟比赛过程的三个函数如下(此处使用了设计模式：Template Method)
    //startCompetition()用于模拟比赛开始的情况，属于父类实现的函数，没有实际用途
    public void startCompetition() {
        System.out.println("Competition::startCompetition()::\"competition started!\"");
        Map<String, Integer> situation = _situation.getSituation();
        System.out.println("本场比赛温度是：" + situation.get("temperature") + ",能见度是：" + situation.get("visibility"));
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

    //race()用于模拟比赛进程，race()中将会根据参赛动物的情况，返回本次比赛的排名，属于子类实现的函数，可以实现根据不同比赛有不同的race流程
    public abstract int[] race();

    //prizeGiving()用于模拟颁奖，没有实际用途，是父类实现的函数
    public void prizeGiving() {
        System.out.println("Competition::prizeGiving()::\"competition prize giving!\"");
        System.out.println("RANK AS：");
        for (int i = 0; i < _competitionResult.length; i++) {
            System.out.println("team:" + _competitionResult[i] + " win rank: " + (i + 1));
        }
    }

    private int transferStateStringToInt(@NotNull String state) {
        String excited = "excited";
        String normal = "normal";
        String sick = "sick";
        String starve = "starve";
        if (state.equals(excited)) {
            return 1;
        } else if (state.equals(normal)) {
            return 0;
        } else if (state.equals(sick)) {
            return -2;
        } else if (state.equals(starve)) {
            return -1;
        }
        return 0;
    }

    protected int[] getRank(int[] power) {
        int[] ans = new int[3];
        ans[0] = ans[1] = ans[2] = 0;
        for (int p = 0; p < 3; p++) {
            int max = -999;
            for (int i = 0; i < power.length; i++) {

                if (power[i] > max) {
                    max = power[i];
                    ans[p] = i;
                }
            }
            power[ans[p]] = -996;
        }
        return ans;
    }

    protected int[] animalPower() {
        int[] power = new int[3];
        int index = 0;
        for (Animal[] team : _contestant) {
            int animalPower = 0;
            System.out.println("contestant--team" + index + ":");
            for (Animal ani : team) {
                ani.showState();
                animalPower += transferStateStringToInt(ani.getState().getState());
            }
            power[index] = animalPower;
            System.out.println("team " + index + " power is : " + animalPower);
            index++;
        }
        return power;
    }


}
