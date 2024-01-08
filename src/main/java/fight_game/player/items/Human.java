package fight_game.player.items;

import fight_game.creature.Creature;
import fight_game.choice.ConsoleChoice;
import fight_game.player.Player;

public class Human extends Player {

    private static Human player;

    private Human(String name) {
        super(name);
        this.creatureChoice = new ConsoleChoice<>();
        this.skillChoice = new ConsoleChoice<>();
        this.actionChoice = new ConsoleChoice<>();
    }
    public static Player getInstance(String name) {
        if (player == null) {
            player = new Human(name);
        }
        return player;
    }

}
