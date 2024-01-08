package fight_game;

import fight_game.boost.items.Creatine;
import fight_game.creature.Creature;
import fight_game.creature.CreatureFactory;
import fight_game.creature.CreatureType;
import fight_game.creature.PowerType;
import fight_game.damage.items.Poison;
import fight_game.heal.items.Bandage;
import fight_game.player.ArtificialIntelligence;
import fight_game.player.Human;
import fight_game.player.Player;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create creatures
        Creature dragon = CreatureFactory.create("Dracolosse", CreatureType.FLY, PowerType.POWERFUL);
        Creature eagle = CreatureFactory.create("Aigle", CreatureType.FLY, PowerType.WEAK);
        Creature cat = CreatureFactory.create("Garfield", CreatureType.FELIN, PowerType.WEAK);

        System.out.println(dragon);

        // Set skills
        Bandage bandage = new Bandage();
        Poison poison = new Poison();
        Creatine creatine = new Creatine();


        dragon.setSkills(List.of(bandage));
        cat.setSkills(List.of(poison, creatine));

        Player human = Human.getInstance("Player 1");
        Player ai = ArtificialIntelligence.getInstance("Player 2 (robot)");

        human.addCreature(dragon);
        ai.addCreature(cat);

        human.getCreatures().forEach(System.out::println);
        ai.getCreatures().forEach(System.out::println);

    }


}
