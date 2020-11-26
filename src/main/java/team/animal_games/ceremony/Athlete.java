
public class Athlete extends Participant
{
    public Athlete(String n)
    {
        super(n);
    }
    
    @Override
    public void changePosition(Position p) {
        // TODO Auto-generated method stub
        super.changePosition(p);
        System.out.println("animal is an athlete");
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("animal is an athlete");
    }
}
