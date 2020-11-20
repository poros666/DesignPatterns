package main.java.team.animal_games.Animal.Builder;

import animal_games.Animal.Animal;

public class BasketballTeam {
    public void setPG(Animal PG) {
        this.PG = PG;
    }
    public void setSG(Animal SG) {
        this.SG = SG;
    }
    public void setSF(Animal SF) {
        this.SF = SF;
    }
    public void setPF(Animal PF) {
        this.PF = PF;
    }
    public void setCenter(Animal center) {
        Center = center;
    }

    private Animal PG;
    private Animal SG;
    private Animal SF;
    private Animal PF;
    private Animal Center;

    @Override
    public String toString() {
        return "PG = " + PG.toString() + '\n'
                +"SG = " + SG.toString() + '\n'
                +"SF = " + SF.toString() + '\n'
                +"PF = " + PF.toString() + '\n'
                +"Center = " + Center.toString() + '\n';
    }
}
