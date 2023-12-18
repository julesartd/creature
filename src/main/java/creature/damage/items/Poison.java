package creature.damage.items;

import creature.Creature;
import creature.skills.Skills;

public class Poison extends Skills {

    protected final int damage = 10;
    protected int maxUses = 3;

    public Poison(int maxUses) {
        super(maxUses);
        this.maxUses = maxUses;
    }


    @Override
    public void use(Creature creature, Creature enemy) {
        creature.setLifePoint(enemy.getLifePoint() - this.damage);
        System.out.println("Le poison a été utilisé, il vous reste " + this.getMaxUses() + " utilisations");
        this.setMaxUses(this.getMaxUses() - 1);

    }

}