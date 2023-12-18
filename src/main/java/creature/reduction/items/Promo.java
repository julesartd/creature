package creature.reduction.items;

import creature.Creature;
import creature.boost.TypeBoost;
import creature.reduction.Reduction;

public class Promo extends Reduction {
    private final double demultiplicateur = 0.6;

    public Promo(int maxUses, double demultiplicateur, TypeBoost propriete) {
        super(maxUses, demultiplicateur, propriete);
    }

    @Override
    public void use(Creature creature, Creature enemy) {

    }
}
