
import java.util.Iterator;
import java.util.Vector;

public class Team extends Participant
{
    private Vector<Athlete> members;
    public Team(String n)
    {
        super(n);
        super.need_seat=0;
        members=new Vector<Athlete>();
    }

    public void addAthlete(Athlete a)
    {
        members.add(a);
        super.need_seat+=1;
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("Animals from team"+getName());
    }
    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
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
        // TODO Auto-generated method stub
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
