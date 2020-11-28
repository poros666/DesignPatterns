package main.java.team.animal_games.ceremony;

// A very basic class of the ceremony,showing the positions in can seat the ceremony's participants
//currently, there are two kinds of positions: stages and normals
public class Position
{
    private int max;//the max number of people can be seated
    private int currentNum;//the current number of people in the seat
    private String name;//the position's name
    private final int stageNum=5;
    //the stage's max number, we can only have few stage positions, which must have the name "stage"
    private final int normalNum=10;//normal position's max number
    public static int positionNum=0;//the number of all the positions

    public Position(String n)//n is the position's name, if you want to have a stage position, name it "stage"
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

    public String getName()//get the name of the position
    {
        return name;
    }

    public boolean can_room(int n)//check if the position can room the certain number n animals
    {
        if(n+currentNum>max)
        {
            System.out.println(name+"can not room");
            return false;
        }
        else
        {
            System.out.println(name+"can room");
            return true;
        }
    }

    public void in(int n)//make animals go into the position
    {
        currentNum+=n;
    }

    public void out(int n)//let animals go out of the position
    {
        if(currentNum-n>=0)
        {
            currentNum-=n;
        }
    }
}