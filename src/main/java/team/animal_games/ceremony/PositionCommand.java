package main.java.team.animal_games.ceremony;

import java.util.Iterator;
import java.util.Vector;

public class PositionCommand extends BaseCommand
{
    Vector<PositionHandler> handlers;

    public PositionCommand(String con)
    {
        super(con,false);
        handlers=new Vector<PositionHandler>();
    }

    public void addHandler(PositionHandler ph)
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
        System.out.println("Command: "+content);
        Iterator<Participant> it=receivers.iterator();
        while(it.hasNext())
        {
            Participant nextReceiver=it.next();
            handlers.firstElement().handle(nextReceiver);
        }
    }
}
