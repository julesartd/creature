package fight_game.choice;

import java.util.List;
import java.util.Scanner;

public class ConsoleChoice<Type extends Choosable> implements Choice<Type> {

    @Override
    public Type choice(List<Type> possibleChoices) {
        return choice(possibleChoices, "");
    }

    @Override
    public Type choice(List<Type> possibleChoices, String name) {
        System.out.println(name);
        for (int i = 0; i < possibleChoices.size(); i++) {
            System.out.println(i + " - " + possibleChoices.get(i).describe());
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        // Check if the choice is in the list
        if (choice < 0 || choice >= possibleChoices.size()) {
            System.out.println("Choix invalide");
            return choice(possibleChoices, name);
        }
        // Return the choice with message "Vous avez choisi ..."
        System.out.println("Vous avez choisi " + possibleChoices.get(choice).describe());
        return possibleChoices.get(choice);
    }

}
