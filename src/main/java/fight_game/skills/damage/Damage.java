package fight_game.skills.damage;

import fight_game.creature.Creature;
import fight_game.skills.Skills;

public abstract class Damage extends Skills {

    private int damage;

    public Damage(int maxUses, String name, int damage) {
        super(maxUses, name);
        this.damage = damage;
    }

    @Override
    public void use(Creature creature, Creature enemy) {
        enemy.setLifePoint(enemy.getLifePoint() - this.damage);
        System.out.println("Vous avez infligé " + this.damage + " dégâts à " + enemy.getName());
        System.out.println("Le poison a été utilisé, il vous reste " + this.getMaxUses() + " utilisations");
        this.setMaxUses(this.getMaxUses() - 1);

    }


}
