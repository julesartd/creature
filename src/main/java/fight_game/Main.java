package fight_game;

import fight_game.action.Action;
import fight_game.action.Attack;
import fight_game.action.Passer;
import fight_game.action.Skill;
import fight_game.skills.boost.items.Creatine;
import fight_game.creature.Creature;
import fight_game.creature.CreatureFactory;
import fight_game.creature.CreatureType;
import fight_game.creature.PowerType;
import fight_game.skills.damage.items.Poison;
import fight_game.skills.heal.items.Bandage;
import fight_game.player.items.ArtificialIntelligence;
import fight_game.player.items.Human;
import fight_game.player.Player;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        // Create creatures
        Creature dragon = CreatureFactory.create("Dracolosse", CreatureType.FLY, PowerType.POWERFULL);
        Creature eagle = CreatureFactory.create("Aigle", CreatureType.FLY, PowerType.WEAK);
        Creature cat = CreatureFactory.create("Garfield", CreatureType.FELIN, PowerType.WEAK);

        System.out.println(dragon);

        // Set skills
        Bandage bandage = new Bandage();
        Poison poison = new Poison();
        Creatine creatine = new Creatine();


        dragon.setSkills(List.of(bandage));
        eagle.setSkills(List.of(poison));
        cat.setSkills(List.of(poison, creatine));

        Player human = Human.getInstance("Player 1");
        Player ai = ArtificialIntelligence.getInstance("Player 2 (robot)");

        human.addCreature(dragon);
        human.addCreature(eagle);
        ai.addCreature(cat);


        Creature aiCreature = ai.choiceCreature();
        Creature humanCreature = human.choiceCreature();


        // Tant que l'une des deux créatures est en vie on continue le combat
        while (aiCreature.isAlive() && humanCreature.isAlive()) {

            play(humanCreature, aiCreature, human);
            play(aiCreature, humanCreature, ai);


        }

        // On affiche le gagnant
        if (aiCreature.isAlive()) {
            System.out.println("Le gagnant est " + ai.getName());
        } else {
            System.out.println("Le gagnant est " + human.getName());
        }

    }

    public static void play(Creature creature, Creature target, Player joueur) {

        System.out.println("Tour de " + joueur.getName());
        System.out.println("Vie de " + creature.getName() + " : " + creature.getLifePoint());
        System.out.println("Armure de " + creature.getName() + " : " + creature.getArmor());

        Skill skill = new Skill(creature, target, joueur);
        Passer pass = new Passer(creature, target, joueur);
        Attack attack = new Attack(creature, target, joueur);

        List<Action> actions = List.of(skill, pass, attack);
        Action action = joueur.getActionChoice().choice(actions, "Choisissez une action");
        action.execute();
        System.out.println("--------------------------------------------------");

    }

}
