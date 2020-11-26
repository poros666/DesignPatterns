
public class BaseHandler implements Handler
{
    private Handler next;
    public void setNext(Handler h)
    {
        next=h;
    }

    public void handle(Participant p)
    {
        if(next!=null)
        {
            next.handle(p);
        }
    }
}