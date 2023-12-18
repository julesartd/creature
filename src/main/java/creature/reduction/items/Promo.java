package creature.reduction.items;

import creature.Creature;
import creature.Type;
import creature.reduction.Reduction;

import static creature.Type.TypePropriete.DAMAGE;

public class Promo extends Reduction {
    private final double demultiplicateur = 0.6;

    public Promo(int maxUses, double demultiplicateur, Type propriete) {
        super(maxUses, demultiplicateur, propriete);
    }

    public void use(Creature attacker, Creature defender) {
        switch (getPropriete()) {
            case DAMAGE -> {
                if (attacker.getDamage() - demultiplicateur > 0) {
                    attacker.setDamage(attacker.getDamage() - demultiplicateur);
                    System.out.println("Vous avez réduit les dégâts de l'adversaire de " + demultiplicateur + " points.");
                } else {
                    System.out.println("Vous avez réduit les dégâts de l'adversaire de " + attacker.getDamage() + " points.");
                    attacker.setDamage(0);
                }
            }
        }
    }
}
