package main.java.team.animal_games.ceremony;

import java.util.LinkedList;

// the host class is one kind of participant, who gives all the commands,and it can also receive some commands
public class Host extends Participant
{
    private LinkedList<Command> commands;//the command queue
    private boolean is_wait;//to show if the host is waiting the end of operation for the last command

    public Host(String n)//n is host's name
    {
        super(n);
        commands=new LinkedList<Command>();
        is_wait=false;
    }
    public void addCommand(Command c)//to add a command to the commands queue
    {
        commands.offer(c);
    }

    public void changeWait()//change host's state
    {
        is_wait=false;
    }
  
    public boolean stateOperation()//find if the host is waiting
    {
        return is_wait;
    }

    public void giveCommand()//giving out commands to some participants 
    {
        Command nextCommand=commands.poll();
        nextCommand.execute();
    }

    @Override
    public void changePosition(Position p) {
        //overrided method to show it's the host changing position
        super.changePosition(p);
        System.out.println("animal is a host");
    }
    @Override
    public void operation() {
        //overrided method to show it's the host doing the operation
        super.operation();
        System.out.println("animal is a host");
    }
}
