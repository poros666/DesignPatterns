package main.java.team.animal_games.award;

import main.java.team.animal_games.ceremony.Participant;

public abstract class Award {
    protected String species;
    protected String level;

    public String getSpecies() {
        return species;
    }

    public String getLevel() {
        return level;
    }

    public boolean add(Participant participant) throws Exception {
        throw new Exception("Add the award in Individual award!");
    }

    /**
     * @param species: award type
     * @param level: award level
     */
    public Award(String species, String level) {
        this.species = species;
        this.level = level;
    }

    public abstract String getName() throws Exception;
}
