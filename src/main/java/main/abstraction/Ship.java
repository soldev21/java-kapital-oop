package main.abstraction;

public class Ship extends Vehicle{

    @Override
    public void move() {
        System.out.println("I'am a moving ship.");
    }

    @Override
    public void sayHello(){
        System.out.println("Hello from ship.");
    }
}
