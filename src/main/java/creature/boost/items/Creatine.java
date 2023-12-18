package creature.boost.items;

import creature.boost.Boost;
import creature.Type;

public abstract class Creatine extends Boost {

    protected final double multiplicateur = 1.5;
    protected Type type;


    public Creatine(int maxUses, int multiplicator, Type type, Type propriete) {
        super(maxUses, multiplicator, type);
    }
}
