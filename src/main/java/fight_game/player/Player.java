package fight_game.player;

import fight_game.creature.Creature;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    private String name;
    private List<Creature> creatures = new ArrayList<>();

    public Player(String name) {
        this.name = name;
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

    public abstract void chooseCreature();


}
