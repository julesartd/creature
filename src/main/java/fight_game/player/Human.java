package fight_game.player;

public class Human extends Player {

    private static Human human;


    private Human(String name) {
        super(name);
    }

    @Override
    public void chooseCreature() {

    }

    public static Human getInstance(String name) {
        if (human == null) {
            human = new Human(name);
        }
        return human;
    }
}
