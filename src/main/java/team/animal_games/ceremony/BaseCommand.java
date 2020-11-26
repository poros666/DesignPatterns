package main.java.team.animal_games.ceremony;

import java.util.Iterator;
import java.util.Vector;

class BaseCommand implements Command {
    private String content;

    private Vector<Participant> receivers;

    public BaseCommand(String c) {
        content = c;
        receivers = new Vector<Participant>();
    }

    public void addReceiver(Participant nm) {
        receivers.add(nm);
    }

    public void execute() {
        System.out.println("Command: " + content);
        Iterator<Participant> it = receivers.iterator();
        while (it.hasNext()) {
            Participant nextReceiver = it.next();
            nextReceiver.operation();
        }
    }
}