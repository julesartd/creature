package fight_game.player;

import fight_game.creature.Creature;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static Player player;
    private String name;
    private List<Creature> creatures = new ArrayList<Creature>();

    public static Player getInstance() {
        if (player == null) {
            player = new Player();
        }
        return player;
    }

    private Player() {
    }

    public String toString() {
        return "Joueur : " + this.name + "\n";
    }

    public void addCreature(Creature creature) {
        this.creatures.add(creature);
    }

    public List<Creature> getCreatures() {
        return this.creatures;
    }


}
