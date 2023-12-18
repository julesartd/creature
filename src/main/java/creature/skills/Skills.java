package creature.skills;

import creature.Creature;

public abstract class Skills {

    private int maxUses;


    public Skills(int maxUses) {
        this.maxUses = maxUses;
    }


    public int getMaxUses() {
        return maxUses;
    }

    public void setMaxUses(int maxUses) {
        this.maxUses = maxUses;
    }


    public abstract void use(Creature creature, Creature enemy);
}
