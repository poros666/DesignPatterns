package main.java.team.animal_games.state;

public interface State {
    public String getState();//get the name of state as a String

    public void showState();//output the name of state in the type of String

    public int getStateToInt();//convert the state to a Integer

    public boolean isNil();//judge whether the state is null
}
