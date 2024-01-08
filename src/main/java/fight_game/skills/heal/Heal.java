package fight_game.skills.heal;

import fight_game.creature.Creature;
import fight_game.skills.Skills;

public abstract class Heal extends Skills {

    private int hp;

    public Heal(int maxUses, String name, int hp) {
        super(maxUses, name);
        this.hp = hp;
    }

    @Override
    public void use(Creature creature, Creature enemy) {
        if (creature.getLifePoint() + this.hp > creature.getMaxLifePoint()) {
            creature.setLifePoint(creature.getMaxLifePoint());
        } else {
            creature.setLifePoint(creature.getLifePoint() + this.hp);
        }


        System.out.println("Le " + this.getName() + " a été utilisé, il vous reste " + this.getMaxUses() + " utilisations");
        this.setMaxUses(this.getMaxUses() - 1);

    }


}
