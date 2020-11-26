package main.java.team.animal_games.award;

import main.java.team.animal_games.ceremony.Participant;

public class IndividualAward extends Award {
    Participant participant;


    /**
     * @param species     award type
     * @param level       award level
     * @param participant winner
     */
    public IndividualAward(String species, String level, Participant participant) {
        super(species, level);
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "IndividualAward: " + getSpecies() + " " + getLevel() + " " + "award winner: " + participant.getName();
    }

    @Override
    public String getName() {
        return participant.getName();
    }
}
