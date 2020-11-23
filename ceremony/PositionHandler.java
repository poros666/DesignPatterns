class PositionHandler extends BaseHandler
{
    protected Position place;

    public PositionHandler(Position p)
    {
        place=p;
    }

    @Override
    public void handle(Participant p)
    {
        if(place.can_room(p.getSeatNum()))
        {
            place.in(p.getSeatNum());
            p.changePosition(place);
        }
        else
        {
            super.handle(p);
        }
    }
}
