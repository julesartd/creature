package creature.reduction;

import creature.Creature;
import creature.boost.TypeBoost;
import creature.skills.Skills;

public abstract class Reduction extends Skills {
    private double demultiplicateur;
    private TypeBoost propriete;

    public Reduction(int maxUses, double demultiplicateur, TypeBoost propriete) {
        super(maxUses);
        this.demultiplicateur = demultiplicateur;
        this.propriete = propriete;
    }


    public abstract void use(Creature creature, Creature enemy);

}
