package main.abstraction;

public abstract class Car extends Vehicle {

//    @Override
//    public void move() {
//        System.out.println("I'am a moving car.");
//    }

    @Override
    public void sayHello(){
        System.out.println("Hello from car.");
    }
}
