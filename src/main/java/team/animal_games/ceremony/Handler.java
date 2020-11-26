
interface Handler
{
    void setNext(Handler h);

    void handle(Participant p);
}