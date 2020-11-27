package main.java.team.animal_games.ceremony;

// the instance of a positionhandler, manage a stage
public class StagePositionHandler extends PositionHandler
{
    public StagePositionHandler()//two kinds of constructors,without or with a created position
    {
        super(new Position("stage"));
    }

    public StagePositionHandler(Position p)
    {
        super(p);
    }

    @Override
    public void handle(Participant p) {
        // overrided method to show it's a stage position handler
        System.out.println("stage handling");
        super.handle(p);
    }
}
