package main.java.team.animal_games.ceremony;

public class Position
{
    private int max;
    private int currentNum;
    private String name;
    private final int stageNum=5;
    private final int normalNum=10;
    public static int positionNum=0;

    public Position(String n)
    {
        positionNum+=1;
        currentNum=0;
        name=n;
        if(name=="stage")
        {
            max=stageNum;
        }
        else
        {
            max=normalNum;
        }
    }

    public String getName()
    {
        return name;
    }

    public boolean can_room(int n)
    {
        if(n+currentNum>max)
        {
            System.out.println("can not room");
            return false;
        }
        else
        {
            System.out.println("can room");
            return true;
        }
    }

    public void in(int n)
    {
        currentNum+=n;
    }

    public void out(int n)
    {
        if(currentNum-n>=0)
        {
            currentNum-=n;
        }
    }
}