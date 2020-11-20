package main.java.team.animal_games.Animal.animals;

import animal_games.Animal.Animal;

public class Monkey extends Animal {
    private final String position;
    private final String team;
    public Monkey(String n, String p, String t){
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
        return "This is a Monkey!" + '\n'
                + "Name is " + this.getName() + '\n'
                + "position is " + position + '\n'
                + "team is " + team ;
    }
}
