//author: Lei chen
package main.java.team.animal_games.state;


public class StateStarve implements State {
    protected String state;

    //set the state name and construct the class
    public StateStarve() {
        state = "starve";
    }

    //output the name of state in the type of String
    @Override
    public void showState() {
        System.out.format("This animal is %s!\n", this.state);
    }

    //get the name of state as a String
    @Override
    public String getState() {
        return this.state;
    }

    //judge whether the state is null
    @Override
    public boolean isNil() {
        return false;
    }

    //convert the state to a Integer -1 which means animal in this state will do worse
    @Override
    public int getStateToInt() {
        return -1;
    }
}
