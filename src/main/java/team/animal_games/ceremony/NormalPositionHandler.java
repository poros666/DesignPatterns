package main.java.team.animal_games.ceremony;

public class NormalPositionHandler extends PositionHandler
{
    public NormalPositionHandler()
    {
        super(new Position("normal"+String.valueOf(Position.positionNum)));
        Position.positionNum+=1;
    }

    public NormalPositionHandler(Position p)
    {
        super(p);
    }

    @Override
    public void handle(Participant p) {
        // TODO Auto-generated method stub
        System.out.println("normal handling");
        super.handle(p);
    }
}