package fight_game.action;

import fight_game.creature.Creature;
import fight_game.choice.Choosable;
import fight_game.player.Player;

public class Skill extends Action {
    public Skill(Creature executor, Creature target, Player player) {
        super(executor, target, player);
    }
    @Override
    public void execute() {
        this.getPlayer().getSkillChoice().choice(
                this.getExecutor().getSkills(), "Choisissez une compétence"
        );


    }
    @Override
    public String describe() {
        return "Utilise une compétence";
    }

}
