package main.java.team.animal_games.ceremony;

public class Official extends Participant
{
    public Official(String n)
    {
        super(n);
    }
    
    @Override
    public void changePosition(Position p) {
        // TODO Auto-generated method stub
        super.changePosition(p);
        System.out.println("animal is an official");
    }
    
    @Override
    public void operation()
    {
        super.operation();
        System.out.println("animal is an official");
    }
    
}
