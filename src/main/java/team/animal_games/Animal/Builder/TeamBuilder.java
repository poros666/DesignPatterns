package main.java.team.animal_games.Animal.Builder;

import animal_games.Animal.Animal;

public interface TeamBuilder {
    void setPG(Animal pg);
    void setSG(Animal sg);
    void setSF(Animal sf);
    void setPF(Animal pf);
    void setCenter(Animal C);
    BasketballTeam getResult();
}
