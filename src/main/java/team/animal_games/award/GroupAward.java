package main.java.team.animal_games.award;

import main.java.team.animal_games.ceremony.Participant;

import java.util.ArrayList;


public class GroupAward extends Award {
    /**
     * @param species award type
     * @param level   award level
     */
    public GroupAward(String species, String level) {
        super(species, level);
        awardList = new ArrayList<>();
    }

    @Override
    public String getName() throws Exception {
        throw new Exception("It is a team award!");
    }

    ArrayList<Award> awardList;

    /**
     * @param participant add the team member who get the award
     * @return true or throw a exception
     */
    @Override
    public boolean add(Participant participant) {
        awardList.add(new IndividualAward(super.species, super.level, participant));
        return true;
    }

    /**
     *
     * @param award add the award to the group award
     * @return true or throw a exception
     */
    @Override
    public boolean add(Award award) {
        awardList.add(award);
        return true;
    }

    @Override
    public String toString() {
        String str = "GroupAward: " + getSpecies() + " " + getLevel();
        str += "\n";
        str += "award winner: ";
        for (var n : awardList) {
            try {
                str += n.getName();
            } catch (Exception e) {
                e.printStackTrace();
            }
            str += " ";
        }
        return str;
    }
}
