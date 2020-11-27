package main.java.team.animal_games.ceremony;

//one kind of participant of the ceremony,nothing special
public class Official extends Participant
{
    public Official(String n)//constructor need an official's name
    {
        super(n);
    }
    
    @Override
    public void changePosition(Position p) {
        //to show it is the official that changes its position
        super.changePosition(p);
        System.out.println("animal is an official");
    }
    
    @Override
    public void operation()
    {
        //to show it is the official that does the operation
        super.operation();
        System.out.println("animal is an official");
    }
    
}
