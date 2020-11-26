package main.java.team.animal_games.ceremony;

import java.util.LinkedList;

class Host extends Participant {
    private LinkedList<Command> commands;

    public Host(Position p, String n) {
        super(p, n);
        commands = new LinkedList<Command>();
    }

    public void addCommand(Command c) {
        commands.offer(c);
    }

    public void giveCommand() {
        Command nextCommand = commands.poll();
        nextCommand.execute();
    }

    @Override
    public void changePosition(Position p) {
        // TODO Auto-generated method stub
        super.changePosition(p);
        System.out.println("animal is a host");
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        super.operation();
        System.out.println("animal is a host");
    }
}
