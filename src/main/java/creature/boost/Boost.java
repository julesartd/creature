package creature.boost;

import creature.Creature;
import creature.others.Type;
import creature.skills.Skills;

public abstract class Boost extends Skills {
    private final float multiplicator;
    private final Type type;


    public Boost(int maxUses, String name, float multiplicator, Type type) {
        super(maxUses, name);
        this.multiplicator = multiplicator;
        this.type = type;
    }

    @Override
    public void use(Creature creature, Creature enemy) {
        switch (type) {
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
