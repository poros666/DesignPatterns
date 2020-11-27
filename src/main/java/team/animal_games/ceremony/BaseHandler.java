package main.java.team.animal_games.ceremony;

//the base class implement Handler interface, used to implement chain of responsibilities Pattern
public class BaseHandler implements Handler
{
    private Handler next; //next node in the chain
    public void setNext(Handler h)//set the next node of the chain after this very node
    {
        next=h;
    }

    public void handle(Participant p)//let the node handle the job and let the next node in the chain to handle
    {
        if(next!=null)
        {
            next.handle(p);
        }
    }
}