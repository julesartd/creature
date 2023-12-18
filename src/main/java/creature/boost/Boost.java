package creature.boost;

import creature.skills.Skills;

public abstract class Boost extends Skills {
    private int maxUses;
    private final int multiplicator;
    private TypeBoost typeBoost;

    public Boost(int maxUses, int multiplicator, TypeBoost typeBoost) {
        super(maxUses);
        this.multiplicator = multiplicator;
        this.typeBoost = typeBoost;
    }

    public int getMultiplicator() {
        return multiplicator;
    }


}
