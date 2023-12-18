package creature.items;

import creature.Creature;

public class Dragon extends Creature {

    public Dragon(String name, int lifePoint, int damage, int armor) {
        super(name, lifePoint, damage, armor);
    }

    @Override
    public boolean isAlive() {
        return this.lifePoint > 0;
    }


    @Override
    public String toString() {
        return super.toString() + "\n";
    }
}
