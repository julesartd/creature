package creature.reduction.items;

import creature.Creature;
import creature.Type;
import creature.reduction.Reduction;


public class Promo extends Reduction {
    private final double demultiplicateur = 0.6;
    private final int maxUses = 1;

    public Promo(int maxUses, double demultiplicateur, Type propriete) {
        super(maxUses, demultiplicateur, propriete);
    }

    public void use(Creature attacker, Creature enemy) {
        switch (getPropriete()) {
            case DAMAGE:
                enemy.setDamage((int) (enemy.getDamage() * this.demultiplicateur));
                break;
            case ARMOR:
                if (enemy.getArmor() > 0) {
                    enemy.setArmor((int) (enemy.getArmor() * this.demultiplicateur));
                }

                break;
            case HEAL:
                if (enemy.getLifePoint() > 0) {
                    enemy.setLifePoint((int) (enemy.getLifePoint() * this.demultiplicateur));
                }

                break;
            default:
                // Handle invalid property type
                break;
        }
    }

    @Override
    public String getName() {
        return "Promo";
    }

}

