package creature.heal.items;

import creature.heal.Heal;
import creature.Creature;

public class Bandage extends Heal {
    protected final int hp = 15;
    protected int maxUses = 5;

    public Bandage(int maxUses) {
        super(maxUses);
        this.maxUses = maxUses;
    }


    @Override
    public void use(Creature creature, Creature enemy) {
        if (creature.getLifePoint() + this.hp > creature.getMaxLifePoint()) {
            creature.setLifePoint(creature.getMaxLifePoint());
        } else {
            creature.setLifePoint(creature.getLifePoint() + this.hp);
        }

        System.out.println("Le medkit a été utilisé, il vous reste " + this.getMaxUses() + " utilisations");
        this.setMaxUses(this.getMaxUses() - 1);

    }
}
