package main.model;

/**
 * Created by Sherif on 2/29/2020.
 */
public class Flying extends Creature {

    public Flying(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(String.format("My name is %s, i'am flying!",getName()));
    }
}
