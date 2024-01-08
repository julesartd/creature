package fight_game.creature.items;

import fight_game.creature.Creature;

public class Eagle extends Creature {

    public Eagle(String name, int lifePoint, int damage, int armor) {
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

