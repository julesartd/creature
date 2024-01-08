package fight_game.reduction.items;

import fight_game.skills.SkillsType;
import fight_game.reduction.Reduction;


public class Promo extends Reduction {
    public Promo() {
        super(5, "Promo", 0.7, SkillsType.ARMOR);
    }
}

