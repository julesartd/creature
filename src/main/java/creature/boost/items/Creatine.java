package creature.boost.items;

import creature.boost.Boost;
import creature.boost.TypeBoost;

public abstract class Creatine extends Boost {

    protected final double multiplicateur = 1.5;
    protected TypeBoost typeBoost;


    public Creatine(int maxUses, int multiplicator, TypeBoost typeBoost, TypeBoost propriete) {
        super(maxUses, multiplicator, typeBoost);
    }
}
