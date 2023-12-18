package creature.boost;

import creature.Type;
import creature.skills.Skills;

public abstract class Boost extends Skills {
    private int maxUses;


    public Boost(int maxUses) {
        super(maxUses);
    }


}
