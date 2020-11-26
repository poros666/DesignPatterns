
public class Participant
{
    protected Position position;
    private String name;
    protected int need_seat=1;
    public Participant(String n)
    {
        name=n;
    }

    public void showInfo()
    {
        System.out.printf("Animal:%s,Position:%s,num:%d\n", name,position.getName(),need_seat);
    }

    public void operation()
    {
        System.out.printf("Animal:%s do the job\n",name);
    }

    public void changePosition(Position p)
    {
        position=p;
        if(p.can_room(need_seat))
        {
            p.in(need_seat);
            System.out.printf("Animal:%s goto %s\n", name,position.getName());
        }
    }

    public int getSeatNum()
    {
        return need_seat;
    }

    public String getName()
    {
        return name;
    }
}

