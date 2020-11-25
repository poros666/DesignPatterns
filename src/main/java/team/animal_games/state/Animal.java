//author: Lei chen
package main.java.team.animal_games.state;

/*这个Animal类用来测试State，后续以李德涛小队的Animal类为准*/
public class Animal {
    public String name;
    private State state;

    public Animal(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public Animal(String name){
        this.name=name;
        this.state=new NullState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }

    public void showState() {
        this.state.showState();
    }
}
