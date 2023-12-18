package creature.heal.items;

import creature.heal.Heal;
import creature.Creature;

public class Medkit extends Heal {

    protected final int hp = 50;
    protected int maxUses = 1;

    public Medkit(int maxUses) {
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

    @Override
    public String getName() {
        return "Medkit";
    }
}
