package creature.boost;

import creature.Type;
import creature.skills.Skills;

public abstract class Boost extends Skills {
    private int maxUses;
    private final int multiplicator;
    private Type type;

    public Boost(int maxUses, int multiplicator, Type type) {
        super(maxUses);
        this.multiplicator = multiplicator;
        this.type = type;
    }

    public int getMultiplicator() {
        return multiplicator;
    }


}
