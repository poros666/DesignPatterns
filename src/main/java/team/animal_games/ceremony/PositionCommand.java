package main.java.team.animal_games.ceremony;

import java.util.Iterator;
import java.util.Vector;
// a kind of change-position command using the chain of responsibilities pattern, let the host give
// this kind of command to test command,proxy,chain of responsibilities at the same time
public class PositionCommand extends BaseCommand
{
    Vector<PositionHandler> handlers;//the handlers being used

    public PositionCommand(String con)//con is the content of the command
    {
        super(con,false);
        handlers=new Vector<PositionHandler>();
    }

    public void addHandler(PositionHandler ph)//to add a node to tha responsbilities chain used by the very command
    {
        if(!handlers.isEmpty())
        {
            handlers.lastElement().setNext(ph);
        }
        handlers.add(ph);
    }
    
    @Override
    public void execute()
    {
        //to let the handlers to handle all the receivers
        System.out.println("Command: "+content);
        Iterator<Participant> it=receivers.iterator();
        while(it.hasNext())
        {
            Participant nextReceiver=it.next();
            handlers.firstElement().handle(nextReceiver);
        }
    }
}
