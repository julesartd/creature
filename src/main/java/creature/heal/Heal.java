package creature.heal;

import creature.Creature;
import creature.skills.Skills;

public abstract class Heal extends Skills {

    private int maxUses;

    public Heal(int maxUses) {
        super(maxUses);
    }

    public abstract void use(Creature creature, Creature enemy);


}
