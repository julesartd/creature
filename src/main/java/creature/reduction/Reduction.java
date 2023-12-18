package creature.reduction;

import creature.Creature;
import creature.Type;
import creature.skills.Skills;

public abstract class Reduction extends Skills {
    private double demultiplicateur;
    private Type propriete;

    public Reduction(int maxUses, double demultiplicateur, Type propriete) {
        super(maxUses);
        this.demultiplicateur = demultiplicateur;
        this.propriete = propriete;
    }


    public abstract void use(Creature creature, Creature enemy);


    public double getDemultiplicateur() {
        return demultiplicateur;
    }

    public Type getPropriete() {
        return propriete;
    }
}
