package fight_game.choice;

import java.util.List;

public interface Choice<Type extends Choosable> {
    public Type choice(List<Type> possibleChoices);
    public Type choice(List<Type> possibleChoices, String name);
}
