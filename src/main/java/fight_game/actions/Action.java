package fight_game.actions;

import fight_game.choice.Choosable;
import fight_game.creature.Creature;
import fight_game.player.Player;

public abstract class Action implements Choosable {

    private Creature executor;
    private Creature target;
    private Player player;

    public Action(Creature executor, Creature target, Player player) {
        this.executor = executor;
        this.target = target;
        this.player = player;
    }

    public Creature getExecutor() {
        return executor;
    }

    public Creature getTarget() {
        return target;
    }

    public Player getPlayer() {
        return player;
    }

    public abstract void execute();

}
