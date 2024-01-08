package fight_game.player;

public class Player {
    private static Player player;
    private String name;

    public static Player getInstance() {
        if (player == null) {
            player = new Player();
        }
        return player;
    }

    private Player() {
    }

    public String toString() {
        return "Joueur : " + this.name + "\n";
    }


}
