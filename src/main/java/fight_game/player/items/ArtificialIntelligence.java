package fight_game.player.items;

import fight_game.choice.ConsoleChoice;
import fight_game.creature.Creature;
import fight_game.player.Player;
import fight_game.choice.RandomChoice;

public class ArtificialIntelligence extends Player {

    private static ArtificialIntelligence player;

    private ArtificialIntelligence(String name) {
        super(name);
        this.creatureChoice = new RandomChoice<>();
        this.skillChoice = new RandomChoice<>();
        this.actionChoice = new RandomChoice<>();
    }

    public static Player getInstance(String name) {
        if (player == null) {
            player = new ArtificialIntelligence(name);
        }
        return player;
    }

}
