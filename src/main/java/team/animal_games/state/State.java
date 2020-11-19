package main.java.team.animal_games.state;

import main.java.team.animal_games.competition.Competition;

public abstract class State {
    public String getState() {
        return state;
    }
    protected String state;
    //public abstract void handleState(Competition competition);//用目前状态处理比赛，可能后续会有修改
    public void showState(){
        System.out.format("State::showState(): Current animal is %s\n",this.state);
    }
}
