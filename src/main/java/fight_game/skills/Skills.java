package fight_game.skills;

import fight_game.creature.Creature;
import fight_game.interfaces.Descriptible;

public abstract class Skills implements Descriptible {

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

    public String describe() {
        return this.name + " (utilisations restantes : " + this.maxUses + ")" + "\n";
    }

}
