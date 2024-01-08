package fight_game.creature;

import fight_game.creature.items.Cat;
import fight_game.creature.items.Dragon;
import fight_game.creature.items.Eagle;
import fight_game.creature.items.Leopard;

public class CreatureFactory {

    private CreatureType type;

    public static Creature create(String name, CreatureType type, PowerType powerType) {
        return switch (type) {
            case FLY -> switch (powerType) {
                case POWERFUL -> new Dragon(name, 100, 50, 50);
                case WEAK -> new Eagle(name, 50, 25, 25);
            };
            case FELIN -> switch (powerType) {
                case POWERFUL -> new Leopard(name, 100, 50, 50);
                case WEAK -> new Cat(name, 50, 25, 25);
            };
        };
    }
}
