package creature;


import static java.lang.Math.abs;

public abstract class Creature {

    protected String name;
    protected int lifePoint;
    private int damage;
    private int armor;
    private int maxLifePoint;


    public Creature(String name, int lifePoint, int damage, int armor) {
        this.name = name;
        this.lifePoint = lifePoint;
        this.damage = damage;
        this.armor = armor;
        this.maxLifePoint = lifePoint;
    }


    public void attack(Creature creature) {
        // Calcul des dégâts
        // Si l'armure est à 0, les dégâts sont infligés à la vie de la créature.
        if (creature.getArmor() == 0) {
            creature.sufferDamage(this.damage);
        } else {
            // Si l'armure est supérieur aux dégâts, l'armure est diminuée des dégâts.
            if (creature.getArmor() > this.damage) {
                creature.setArmor(creature.getArmor() - this.damage);
            } else {
                // Si l'armure est inférieur aux dégâts, l'armure est mise à 0 et les dégâts sont
                // infligés à la vie de la créature.
                creature.sufferDamage(this.damage - creature.getArmor());
                creature.setArmor(0);
            }
        }
    }


    public void sufferDamage(int damage) {
        this.lifePoint -= damage;
        if (this.lifePoint < 0) {
            this.lifePoint = 0;
        }
    }

    public String toString() {
        return this.name + " à maintenant " + this.lifePoint + " point de vie et " + armor + " d'armure";
    }


    public abstract boolean isAlive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMaxLifePoint() {
        return maxLifePoint;
    }

    public void setMaxLifePoint(int maxLifePoint) {
        this.maxLifePoint = maxLifePoint;
    }


}
