//author: Lei chen
package main.java.team.animal_games.state;


public class StateSick extends State{
    public StateSick(){
        state="sick";
    }
    @Override
    public void showState(){
        System.out.format("State::showState(): %s!\n",this.state);
    }
    @Override
    public String getState(){
        return this.state;
    }
    @Override
    public boolean isNil(){
        return false;
    }
    @Override
    public int getStateToInt(){
        return -2;
    }
}
