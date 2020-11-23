//author: Lei chen
package main.java.team.animal_games.state;


public class StateExcited extends State {
    public StateExcited() {
        state = "excited";
    }

    @Override
    public void showState() {
        System.out.format("This animal is %s!\n", this.state);
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public int getStateToInt() {
        return 1;
    }
}
