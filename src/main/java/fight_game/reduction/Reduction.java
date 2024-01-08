package fight_game.reduction;

import fight_game.creature.Creature;
import fight_game.skills.SkillsType;
import fight_game.skills.Skills;

public abstract class Reduction extends Skills {
    private double demultiplicator;
    private SkillsType skillsType;

    public Reduction(int maxUses, String name, double demultiplicator, SkillsType skillsType) {
        super(maxUses, name);
        this.demultiplicator = demultiplicator;
        this.skillsType = skillsType;
    }


    public void use(Creature creature, Creature enemy) {
        switch (skillsType) {
            case DAMAGE:
                reduceDamage(creature);
                break;
            case ARMOR:
                reduceArmor(creature);
                break;
            default:
                break;
        }
    }

    public void reduceDamage(Creature creature) {
        creature.setDamage((int) (creature.getDamage() / demultiplicator));
    }

    public void reduceArmor(Creature creature) {
        creature.setArmor((int) (creature.getArmor() / demultiplicator));
    }
}
