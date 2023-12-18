package creature.skills;

import creature.Creature;

public abstract class Skills {

    protected int maxUses;
    protected String name;


    public Skills(int maxUses, String name) {
        this.maxUses = maxUses;
        this.name = name;
    }


    public int getMaxUses() {
        return maxUses;
    }

    public void setMaxUses(int maxUses) {
        this.maxUses = maxUses;
    }


    public abstract void use(Creature creature, Creature enemy);

    public String getName() {
        return this.name;
    }

    ;

}
