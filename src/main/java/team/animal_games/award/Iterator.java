package main.java.team.animal_games.award;

public interface Iterator {
    boolean hasNext();

    void next();

    void reset();

    Object getCurrent(int index);
}
