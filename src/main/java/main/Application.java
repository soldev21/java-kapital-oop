package main;

import main.model.*;

/**
 * Created by Sherif on 2/29/2020.
 */
public class Application {

    public static void main(String[] args) {
//        Creature creature = new Creature("Salamander");
//        creature.feed();
//        Mammals mammals = new Mammals("Goat");
//        mammals.feed();
        Flying flying = new Flying("Mosquito");
        flying.feed();
        flying.fly();

        Creature creature = flying;
        creature.feed();
        creature.getName();

        Flying flying1 = (Flying) creature;
        flying1.fly();

    }
}
