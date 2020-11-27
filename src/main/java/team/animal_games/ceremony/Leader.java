package main.java.team.animal_games.ceremony;

public class Leader extends Participant
{
    private Team team;
    public Leader(String n,Team t)
    {
        super(n);
        team=t;
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("animal is a leader,so its team follows it");
        team.operation();
    }
    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        super.showInfo();
        System.out.println("the animal leads a team "+team.getName());
    }
    @Override
    public int getSeatNum() {
        // TODO Auto-generated method stub
        return 1+team.getSeatNum();
    }
    @Override
    public void changePosition(Position p) {
        // TODO Auto-generated method stub
        if(p.can_room(1+team.getSeatNum()))
        {
            super.position=p;
            System.out.println("animal is a leader,so its team follows it");
            team.changePosition(p);
        }
    }
}