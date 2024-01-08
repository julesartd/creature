package fight_game.action;

import fight_game.creature.Creature;
import fight_game.choice.Choosable;
import fight_game.player.Player;

public class Passer extends Action {
    public Passer(Creature executor, Creature target, Player player) {
        super(executor, target, player);
    }
    @Override
    public void execute() {
        System.out.println(this.getExecutor().getName() + " passe son tour");
    }

    @Override
    public String describe() {
        return "Passer son tour";
    }
}
