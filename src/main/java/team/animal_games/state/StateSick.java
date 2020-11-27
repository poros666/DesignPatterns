//author: Lei chen
package main.java.team.animal_games.state;


public class StateSick implements State {
    protected String state;

    //set the state name and construct the class
    public StateSick() {
        state = "sick";
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

    //convert the state to a Integer -2 which means animal in this state will do much worse
    @Override
    public int getStateToInt() {
        return -2;
    }
}
