package main.java.team.animal_games.ceremony;

//changePosition is a concrete class extending BaseCommand, this class implement the function to
//change receivers' position without using chain of responsibilities pattern, give the kind of command to leaders
//can test both command pattern and proxy pattern
public class ChangePosition extends BaseCommand
{
    Position direction;//the position objection
    public ChangePosition(Position d, String con)
    // constructor of the class, d is the moving-to place, and con is the content of this command
    {
        super(con,true);
        direction=d;
    }
    //override the basecommand's execute method, use all receiver's changePosition method,
    //and change their position to direction
    @Override
    public void execute() {
        System.out.println("Command: "+content);
        Iterator<Participant> it=receivers.iterator();
        while(it.hasNext())
        {
            Participant nextReceiver=it.next();
            nextReceiver.changePosition(direction);
        }
        System.out.println("go to"+direction.getName());
    }
}
