package fight_game.choice;

import java.util.List;

public class RandomChoice<Type extends Choosable> implements Choice<Type> {
    public Type choice(List<Type> possibleChoices) {
        Type choice = possibleChoices.get((int) (Math.random() * possibleChoices.size()));
        System.out.println("L'ordinateur a choisi " + choice.describe());
        return choice;
    }
    public Type choice(List<Type> possibleChoices, String name) {
        Type choice = possibleChoices.get((int) (Math.random() * possibleChoices.size()));
        System.out.println("L'ordinateur a choisi " + choice.describe());
        return choice;
    }
}
