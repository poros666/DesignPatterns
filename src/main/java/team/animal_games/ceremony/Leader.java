package main.java.team.animal_games.ceremony;

//one kind of participant class, the leaders are proxy of teams following them,using it to implement
// proxy method
public class Leader extends Participant
{
    private Team team;//the team following the leader
    public Leader(String n,Team t)//n is leader's name,t is the team
    {
        super(n);
        team=t;
    }

    @Override
    public void operation() {
        // overrided method, to show the animal is a leader and let the team do the same job , which 
        //embody the proxy pattern
        super.operation();
        System.out.println("animal is a leader,so its team follows it");
        team.operation();
    }
    @Override
    public void showInfo() {
        //to show the extra information of the leader-the team following the leader
        super.showInfo();
        System.out.println("the animal leads a team "+team.getName());
    }
    @Override
    public int getSeatNum() {
        //to get the total number of the needed seat for the leader and its team
        return 1+team.getSeatNum();
    }
    @Override
    public void changePosition(Position p) {
        // overrided method, to show the animal is a leader and let the team do the same job , which 
        //embody the proxy pattern
        if(p.can_room(1+team.getSeatNum()))
        {
            super.position=p;
            System.out.println("animal is a leader,so its team follows it");
            team.changePosition(p);
        }
    }
}