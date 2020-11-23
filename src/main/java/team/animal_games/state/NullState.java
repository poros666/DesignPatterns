//author: Lei chen
package main.java.team.animal_games.state;

//无特殊状态，用作空对象
public class NullState extends State {
    @Override
    public void showState() {
        System.out.println("This animal doesn't have a abnormal state.");
    }

    @Override
    public String getState() {
        return "No any state";
    }

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public int getStateToInt() {
        return 0;
    }
}
