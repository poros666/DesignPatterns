package main.java.team.animal_games.ceremony;

import java.util.Iterator;
import java.util.Vector;

//a kind of participant, and its proxy is the team's leader, and it's the proxy of athletes in the team
public class Team extends Participant
{
    private Vector<Athlete> members;//athlete members
    public Team(String n)//n is the team's name
    {
        super(n);
        super.need_seat=0;
        members=new Vector<Athlete>();
    }

    public void addAthlete(Athlete a)// add an athlete member to the team
    {
        members.add(a);
        super.need_seat+=1;
    }

    @Override
    public void operation() {
        // use overrided method to show the job is done by a particular team
        super.operation();
        System.out.println("Animals from team"+getName());
    }
    @Override
    public void showInfo() {
        //show the basic information of the team and the team's members' name
        super.showInfo();
        System.out.println("member names: ");
        Iterator<Athlete> it=members.iterator();
        while(it.hasNext())
        {
            Athlete nextAthlete=it.next();
            System.out.println(nextAthlete.getName());
        }
    }
    @Override
    public void changePosition(Position p) {
        //overrided method making the team class act as the athletes' proxy
        
        super.position=p;
        System.out.println("Animals from team"+getName());
        Iterator<Athlete> it=members.iterator();
        while(it.hasNext())
        {
            Athlete nextAthlete=it.next();
            nextAthlete.changePosition(p);
        }
    }
}
