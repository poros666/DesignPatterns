package animal_games.Animal.animals;

import animal_games.Animal.Animal;

public class Panda extends Animal {
    private final String position;
    private final String team;
    public Panda(String n, String p, String t){
        this.setName(n);
        this.position = p;
        this.team = t;
    }

    public String getPosition() {
        return this.position;
    }
    public String getTeam(){
        return this.team;
    }

    @Override
    public String toString() {
        return "This is a Panda!" + '\n'
                + "Name is " + this.getName() + '\n'
                + "position is " + position + '\n'
                + "team is " + team;
    }
}
