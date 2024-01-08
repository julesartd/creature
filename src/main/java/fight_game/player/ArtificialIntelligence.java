package fight_game.player;

public class ArtificialIntelligence extends Player {

    private static ArtificialIntelligence ai;


    private ArtificialIntelligence(String name) {
        super(name);
    }

    @Override
    public void chooseCreature() {

    }


    public static ArtificialIntelligence getInstance(String name) {
        if (ai == null) {
            ai = new ArtificialIntelligence(name);
        }
        return ai;
    }
}
