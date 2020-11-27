package main.java.team.animal_games.ceremony;
//class Athlete is one kind of participants,which overrides changePosition and operation methods
//class team is this class's proxy
public class Athlete extends Participant
{
    public Athlete(String n)//constructor of class Athlete, n is Athlete's name
    {
        super(n);
    }
    
    @Override
    public void changePosition(Position p) {
        //add one line to show the animal is an athlete
        // TODO Auto-generated method stub
        super.changePosition(p);
        System.out.println("animal is an athlete");
    }

    @Override
    public void operation() {
        //add one line to show the animal is an athlete
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("animal is an athlete");
    }
}
