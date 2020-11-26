package main.java.team.animal_games.ceremony;

interface Handler {
    void setNext(Handler h);

    void handle(Participant p);
}