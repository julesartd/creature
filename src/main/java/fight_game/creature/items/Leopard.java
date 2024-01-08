package fight_game.creature.items;

import fight_game.creature.Creature;

public class Leopard extends Creature {

    private int firstLifePoint = 100;


    public Leopard(String name, int lifePoint, int damage, int armor) {
        super(name, lifePoint, damage, armor);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public boolean isAlive() {
        return this.lifePoint > 0;
    }

    @Override
    public void sufferDamage(int damage) {
        this.lifePoint -= damage;
        if (this.lifePoint <= 0) {
            this.lifePoint = firstLifePoint;
            System.out.println("Le chat a perdu une vie, ses points de vie sont réinitialisé");
        }


    }


}
