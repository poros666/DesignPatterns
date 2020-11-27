package main.java.team.animal_games.ceremony;

//the handler used to deal with the position issues,there are two kinds of this type of handler
//the stagepositionhandler and the normalpositionhandler,use them by creating particular child classes
public class PositionHandler extends BaseHandler
{
    protected Position place;//the position managed by the very node

    public PositionHandler(Position p)//p is the particular position being managed
    {
        place=p;
    }

    @Override
    public void handle(Participant p)
    {
        //if the position can handle the participant,then let the participants get into the position
        //or let the next handler deal with the participant
        if(place.can_room(p.getSeatNum()))
        {
            p.changePosition(place);
        }
        else
        {
            super.handle(p);
        }
    }
}
