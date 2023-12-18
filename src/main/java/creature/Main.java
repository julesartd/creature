package creature;

import creature.boost.items.Creatine;
import creature.damage.items.Poison;
import creature.heal.items.Bandage;
import creature.items.Cat;
import creature.items.Dragon;
import creature.skills.Skills;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create creatures
        Dragon dragon = new Dragon("Dracolosse", 100, 70, 100);
        Cat cat = new Cat("Garfield", 100, 60, 50);

        // Set skills
        Bandage bandage = new Bandage(5);
        Poison poison = new Poison(2);
        Creatine creatine = new Creatine(3);

        dragon.setSkills(List.of(bandage));
        cat.setSkills(List.of(poison, creatine));

        // Select player
        Creature currentPlayer = null;
        while (currentPlayer == null) {
            System.out.println("Which player would you like to start with? (1 for Dragon, 2 for Cat)");
            int playerChoice = scanner.nextInt();
            switch (playerChoice) {
                case 1:
                    currentPlayer = dragon;
                    break;
                case 2:
                    currentPlayer = cat;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        // Game loop
        while (dragon.isAlive() && cat.isAlive()) {
            System.out.println(currentPlayer.getName() + "'s turn:");

            // Display options
            System.out.println("1. Use skill");
            System.out.println("2. Attack");
            System.out.println("3. End turn");

            // Get user input
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Which skill would you like to use?");
                    List<Skills> skills = currentPlayer.getSkills();
                    for (int i = 0; i < skills.size(); i++) {
                        System.out.println((i + 1) + ". " + skills.get(i).getName());
                    }
                    int skillChoice = scanner.nextInt();
                    Skills selectedSkill = skills.get(skillChoice - 1);
                    selectedSkill.use(currentPlayer, currentPlayer == dragon ? cat : dragon);
                    System.out.println(currentPlayer == dragon ? cat : dragon);
                    break;
                case 2:
                    currentPlayer.attack(currentPlayer == dragon ? cat : dragon);
                    break;
                case 3:
                    currentPlayer = currentPlayer == dragon ? cat : dragon;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        // Display winner
        if (dragon.isAlive()) {
            System.out.println("Dragon wins!");
        } else {
            System.out.println("Cat wins!");
        }
    }


}
