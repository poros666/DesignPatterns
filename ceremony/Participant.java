class Participant
{
    protected Position position;
    private String name;
    protected int need_seat=1;
    public Participant(Position p,String n)
    {
        position=p;
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
        System.out.printf("Animal:%s goto %s\n", name,position.getName());
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

