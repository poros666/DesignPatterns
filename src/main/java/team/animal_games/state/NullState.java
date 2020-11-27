//author: Lei chen
package main.java.team.animal_games.state;

//work as null object
public class NullState implements State {
    //show the null state situation
    @Override
    public void showState() {
        System.out.println("This animal doesn't have a abnormal state.");
    }

    //output that this state is a null object
    @Override
    public String getState() {
        return "No any state";
    }

    //judge whether the state is null
    @Override
    public boolean isNil() {
        return true;
    }

    //convert the state to a Integer 0 which means this state will do nothing to the competition
    @Override
    public int getStateToInt() {
        return 0;
    }
}
