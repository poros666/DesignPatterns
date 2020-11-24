class Official extends Participant
{
    public Official(Position p,String n)
    {
        super(p,n);
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
