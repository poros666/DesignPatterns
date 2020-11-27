package main.java.team.animal_games.ceremony;

import java.util.Iterator;
import java.util.Vector;
//the base class implements interface command, used to implement Command Pattern
public class BaseCommand implements Command
{
    protected String content;//the content of the command
    
    protected boolean is_pos_com;//show if the command will change receiver's position

    protected Vector<Participant> receivers;//receivers of the command,have to be some participant objects

    public BaseCommand(String c,boolean i)//the constructor,two parameters are content and is_pos_com
    {
        is_pos_com=i;
        content=c;
        receivers=new Vector<Participant>();
    }

    public void addReceiver(Participant nm)//use the command to add a participant to the receivers
    {
        receivers.add(nm);
    }

    public void execute()
    //execute the command, it will show the command's content at first, 
    //and execute the all receiver's operation methods                   
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