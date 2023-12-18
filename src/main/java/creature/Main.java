package creature;

import creature.items.Cat;
import creature.items.Dragon;

public class Main {

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Dracolosse", 100, 70, 100);
        Cat cat = new Cat("Garfield", 100, 60, 50);

        while (dragon.isAlive() && cat.isAlive()) {
            System.out.println("Le dragon attaque en infligeant " + dragon.getDamage() + " points de dégats");
            dragon.attack(cat);
            System.out.println(cat);
            System.out.println("Le chat attaque en infligeant " + cat.getDamage() + " points de dégats");
            cat.attack(dragon);
            System.out.println(dragon);

        }

        if (dragon.isAlive()) {
            System.out.println("Dragon win");
        } else {
            System.out.println("Cat win");
        }


    }


}
