package creature.boost.items;

import creature.Creature;
import creature.boost.Boost;
import creature.Type;

public class Creatine extends Boost {

    protected final double multiplicator = 1.5;


    public Creatine(int maxUses) {
        super(maxUses);
    }


    @Override
    public void use(Creature creature, Creature enemy) {

        creature.setDamage((int) (creature.getDamage() * multiplicator));
    }

    @Override
    public String getName() {
        return "Creatine";
    }

}



