package main.java.team.animal_games.ceremony;

// a very basic class of the ceremony,representing all participants of the ceremony
public class Participant
{
    protected Position position;//which position the participant is in
    private String name;//participant's name
    protected int need_seat=1;//the num it need to be seated, the default value is one
    public Participant(String n)//n is the participant's name
    {
        name=n;
    }

    public void showInfo()
    {
        //used to show the animal's every basic information
        System.out.printf("Animal:%s,Position:%s,num:%d\n", name,position.getName(),need_seat);
    }

    public void operation()
    {
        //show the participant accept a command and do some jobs
        System.out.printf("Animal:%s do the job\n",name);
    }

    public void changePosition(Position p)
    {
        //make the participant going to another place, it can also be an answer of a command
        
        if(p.can_room(need_seat))
        {
            if(position!=null)
            {
                position.out(need_seat);
            }
            position=p;
            p.in(need_seat);
            System.out.printf("Animal:%s goto %s\n", name,position.getName());
        }
    }

    public int getSeatNum()
    {
        //get the number of needed seats
        return need_seat;
    }

    public String getName()
    {
        //get the animal's name
        return name;
    }
}

