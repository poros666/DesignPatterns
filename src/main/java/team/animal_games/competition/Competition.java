package main.java.team.animal_games.competition;

import main.java.team.animal_games.situation.Situation;

public abstract class Competition {
    //protected Animal _contestant;
    //protected Stadium _stadium;
    //protected Rule _ruleSet;
    protected Situation _situation;
    protected int[] _competitionResult;

    public Competition(){
        System.out.println("Competition::Competition()::\"constructor\"");
    }

    public void startCompetition(){
        System.out.println("Competition::startCompetition()::\"competition started!\"");
        System.out.println(" ________  ________  _____ ______   _______   ________  _________  ________  ________  _________  ___       \n" +
                "|\\   ____\\|\\   __  \\|\\   _ \\  _   \\|\\  ___ \\ |\\   ____\\|\\___   ___\\\\   __  \\|\\   __  \\|\\___   ___\\\\  \\      \n" +
                "\\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|\\ \\  \\___|\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\|___ \\  \\_\\ \\  \\     \n" +
                " \\ \\  \\  __\\ \\   __  \\ \\  \\\\|__| \\  \\ \\  \\_|/_\\ \\_____  \\   \\ \\  \\ \\ \\   __  \\ \\   _  _\\   \\ \\  \\ \\ \\  \\    \n" +
                "  \\ \\  \\|\\  \\ \\  \\ \\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\|____|\\  \\   \\ \\  \\ \\ \\  \\ \\  \\ \\  \\\\  \\|   \\ \\  \\ \\ \\__\\   \n" +
                "   \\ \\_______\\ \\__\\ \\__\\ \\__\\    \\ \\__\\ \\_______\\____\\_\\  \\   \\ \\__\\ \\ \\__\\ \\__\\ \\__\\\\ _\\    \\ \\__\\ \\|__|   \n" +
                "    \\|_______|\\|__|\\|__|\\|__|     \\|__|\\|_______|\\_________\\   \\|__|  \\|__|\\|__|\\|__|\\|__|    \\|__|     ___ \n" +
                "                                                \\|_________|                                           |\\__\\\n" +
                "                                                                                                       \\|__|\n" +
                "                                                                                                            ");
    }

    public abstract int[] race();

    public void prizeGiving(){
        System.out.println("Competition::prizeGiving()::\"competition prize giving!\"");
        System.out.println("RANK AS：");
        for(int i=0;i<_competitionResult.length;i++){
            System.out.println("team:"+_competitionResult[i]+" win rank: "+i+", got "+i+" points");
        }
    }

}
