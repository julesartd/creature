package creature;

import creature.items.Cat;
import creature.items.Dragon;

public class Main {

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Dracolosse", 100, 70, 100);
        Cat cat = new Cat("Garfield", 100, 60, 50);



        while (dragon.isAlive() && cat.isAlive()) {

            dragon.attack(cat);
            System.out.println(cat);

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
