package animal_games.Animal;
import main.java.team.animal_games.state.State;

public class Animal {
    private State state;
    private String name;

    public Animal(){};
    public Animal(State s, String n){
        this.state = s;
        this.name = n;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setState(State s){
        this.state=s;
    }
    public State getState(){
        return this.state;
    }
    public void showState(){
        this.state.showState();
    }
}
