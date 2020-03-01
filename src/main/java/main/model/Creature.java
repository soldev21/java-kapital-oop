package main.model;

/**
 * Created by Sherif on 2/29/2020.
 */
public class Creature {

    private String name;

    public Creature(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(){
        System.out.println(String.format("My name is %s, i'am feeding!",name));
    }
}
