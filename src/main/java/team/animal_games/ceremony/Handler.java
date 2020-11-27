package main.java.team.animal_games.ceremony;

//the handler interface, to implement chain of responsibilities pattern
interface Handler
{
    void setNext(Handler h);

    void handle(Participant p);
}