package fight_game.actions.items;

import fight_game.actions.Action;
import fight_game.creature.Creature;
import fight_game.player.Player;

public class Skip extends Action {
    public Skip(Creature executor, Creature target, Player player) {
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
