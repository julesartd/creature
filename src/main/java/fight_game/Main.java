package fight_game;

import fight_game.boost.items.Creatine;
import fight_game.creature.Creature;
import fight_game.creature.CreatureFactory;
import fight_game.creature.CreatureType;
import fight_game.damage.items.Poison;
import fight_game.heal.items.Bandage;
import fight_game.player.Player;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create creatures
        Creature dragon = CreatureFactory.create("Dragon", 100, 50, 50, CreatureType.DRAGON);
        Creature cat = CreatureFactory.create("Cat", 100, 50, 50, CreatureType.CAT);

        // Set skills
        Bandage bandage = new Bandage();
        Poison poison = new Poison();
        Creatine creatine = new Creatine();


        dragon.setSkills(List.of(bandage));
        cat.setSkills(List.of(poison, creatine));

        Player player = Player.getInstance();
        player.addCreature(dragon);


        player.getCreatures().forEach(System.out::println);

    }


}
