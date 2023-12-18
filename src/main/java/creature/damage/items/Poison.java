package creature.damage.items;

import creature.Creature;
import creature.skills.Skills;

public class Poison extends Skills {
    @Override
    public String getName() {
        return "Poison";
    }

    protected final int damage = 10;

    public Poison(int maxUses) {
        super(maxUses);

    }


    @Override
    public void use(Creature creature, Creature enemy) {
        enemy.setLifePoint(enemy.getLifePoint() - this.damage);
        System.out.println("Vous avez infligé " + this.damage + " dégâts à " + enemy.getName());
        System.out.println("Le poison a été utilisé, il vous reste " + this.getMaxUses() + " utilisations");
        this.setMaxUses(this.getMaxUses() - 1);

    }

}