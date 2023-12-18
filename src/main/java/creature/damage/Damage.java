package creature.damage;

import creature.Creature;
import creature.skills.Skills;

public abstract class Damage extends Skills {

    private int maxUses;

    public Damage(int maxUses) {
        super(maxUses);
    }

    @Override
    public abstract void use(Creature attacker, Creature enemy);


}
