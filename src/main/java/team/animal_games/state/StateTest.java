//author: Lei chen
//use for Test
package main.java.team.animal_games.state;

public class StateTest {
    public static void main(String[] args){
        Animal bird=new Animal("bird",new NullState());
        bird.showState();
        bird.setState(new StateStarve());
        bird.showState();
    }
}
