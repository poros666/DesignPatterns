
import java.util.LinkedList;

public class Host extends Participant
{
    private LinkedList<Command> commands;
    private boolean is_wait;

    public Host(String n)
    {
        super(n);
        commands=new LinkedList<Command>();
        is_wait=false;
    }
    public void addCommand(Command c)
    {
        commands.offer(c);
    }

    public void changeWait()
    {
        is_wait=false;
    }
  
    public boolean stateOperation()
    {
        return is_wait;
    }

    public void giveCommand()//guarded method
    {
        Command nextCommand=commands.poll();
        nextCommand.execute();
    }

    @Override
    public void changePosition(Position p) {
        // TODO Auto-generated method stub
        super.changePosition(p);
        System.out.println("animal is a host");
    }
    @Override
    public void operation() {
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("animal is a host");
    }
}
