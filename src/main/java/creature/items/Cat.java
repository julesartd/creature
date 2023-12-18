package creature.items;

import creature.Creature;

public class Cat extends Creature {

    private int life = 9;
    private int firstLifePoint = 100;


    public Cat(String name, int lifePoint, int damage, int armor) {
        super(name, lifePoint, damage, armor);
    }

    public String toString() {
        return super.toString() + " ainsi que " + this.life + " vies \n";
    }

    @Override
    public boolean isAlive() {
        return this.lifePoint > 0;
    }

    @Override
    public void sufferDamage(int damage) {
        this.lifePoint -= damage;
        if (this.lifePoint <= 0) {
            this.life--;
            this.lifePoint = firstLifePoint;
            System.out.println("Le chat a perdu une vie, ses points de vie sont réinitialisé");
        }


    }



}
