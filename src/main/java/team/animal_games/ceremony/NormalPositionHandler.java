package main.java.team.animal_games.ceremony;

// the instance of a positionhandler, manage a normal position
public class NormalPositionHandler extends PositionHandler
{
    public NormalPositionHandler()//the constructor, create a handler without a particular position
    {
        super(new Position("normal"+String.valueOf(Position.positionNum)));
        Position.positionNum+=1;
    }

    public NormalPositionHandler(Position p)
    // use this constructor, if you have a particular position needed management
    {
        super(p);
    }

    @Override
    public void handle(Participant p) {
        // use this overrided method to show it is the particular type of handler handling the participant
        System.out.println("normal handling");
        super.handle(p);
    }
}