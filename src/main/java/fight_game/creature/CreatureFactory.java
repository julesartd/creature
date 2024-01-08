package fight_game.creature;

import fight_game.creature.items.Cat;
import fight_game.creature.items.Dragon;

public class CreatureFactory {

    private CreatureType type;

    public static Creature create(String name, int lifePoint, int damage, int armor, CreatureType type) {
        return switch (type) {
            case DRAGON -> new Dragon(name, lifePoint, damage, armor);
            case CAT -> new Cat(name, lifePoint, damage, armor);
            default -> null;
        };
    }
}
