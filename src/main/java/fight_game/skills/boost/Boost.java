package fight_game.skills.boost;

import fight_game.creature.Creature;
import fight_game.skills.SkillsType;
import fight_game.skills.Skills;

public abstract class Boost extends Skills {
    private final float multiplicator;
    private final SkillsType skillsType;


    public Boost(int maxUses, String name, float multiplicator, SkillsType skillsType) {
        super(maxUses, name);
        this.multiplicator = multiplicator;
        this.skillsType = skillsType;
    }

    @Override
    public void use(Creature creature, Creature enemy) {
        switch (skillsType) {
            case DAMAGE:
                boostDamage(creature);
                break;
            case ARMOR:
                boostArmor(creature);
                break;
            default:
                break;
        }
    }

    private void boostDamage(Creature creature) {
        creature.setDamage((int) (creature.getDamage() * multiplicator));
    }

    private void boostArmor(Creature creature) {
        creature.setArmor((int) (creature.getArmor() * multiplicator));
    }


}
