package creature.reduction;

import creature.Creature;
import creature.others.Type;
import creature.skills.Skills;

public abstract class Reduction extends Skills {
    private double demultiplicator;
    private Type type;

    public Reduction(int maxUses, String name, double demultiplicator, Type type) {
        super(maxUses, name);
        this.demultiplicator = demultiplicator;
        this.type = type;
    }


    public void use(Creature creature, Creature enemy) {
        switch (type) {
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
