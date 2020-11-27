package main.java.team.animal_games.ceremony;

import java.util.Iterator;
import java.util.Vector;

public class BaseCommand implements Command
{
    protected String content;
    
    protected boolean is_pos_com;

    protected Vector<Participant> receivers;

    public BaseCommand(String c,boolean i)
    {
        is_pos_com=i;
        content=c;
        receivers=new Vector<Participant>();
    }

    public void addReceiver(Participant nm)
    {
        receivers.add(nm);
    }

    public void execute()
    {
        System.out.println("Command: "+content);
        Iterator<Participant> it=receivers.iterator();
        while(it.hasNext())
        {
            Participant nextReceiver=it.next();
            nextReceiver.operation();
        }
    }
}