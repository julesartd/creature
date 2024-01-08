package fight_game.player;

import fight_game.creature.Creature;
import fight_game.choice.Choice;
import fight_game.skills.Skills;
import fight_game.actions.Action;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    private String name;
    private List<Creature> creatures = new ArrayList<>();

    protected Choice<Creature> creatureChoice;
    protected Choice<Skills> skillChoice;

    protected Choice<Action> actionChoice;

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


    public Creature choiceCreature() {
         return this.creatureChoice.choice(this.creatures, "Choisissez une créature");
    }

    public Choice<Skills> getSkillChoice() {
        return this.skillChoice;
    }

    public Choice<Action> getActionChoice() {
        return this.actionChoice;
    }

    public String getName() {
        return this.name;
    }
}
