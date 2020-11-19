//author: Lei chen
package main.java.team.animal_games.state;
//无特殊状态，用作空对象
public class NullState extends State{
    @Override
    public void showState(){
        System.out.println("State::showState(): Not any abnormal state.");
    }
    @Override
    public String getState(){
        return "The current animal doesn't have any state";
    }
    @Override
    public boolean isNil(){
        return true;
    }
    @Override
    public int getStateToInt(){
        return 0;
    }
}
