package fight_game.action;

import fight_game.creature.Creature;
import fight_game.choice.Choosable;
import fight_game.player.Player;

public class Attack extends Action{
    public Attack(Creature executor, Creature target, Player player) {
        super(executor, target, player);
    }
    @Override
    public void execute() {
        this.getExecutor().attack(this.getTarget());
    }

    @Override
    public String describe() {
        return "Attaque l'ennemi";
    }
}
