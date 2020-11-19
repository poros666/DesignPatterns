//author: Lei chen
package main.java.team.animal_games.state;


public abstract class State {
    protected String state;
    abstract public String getState();
    abstract public void showState();
    abstract public int getStateToInt();
    abstract public boolean isNil();
}
