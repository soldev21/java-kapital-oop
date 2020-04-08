package main.abstraction;

public abstract class Vehicle {
    public abstract void move();

    public void sayHello(){
        System.out.println("Hi everyone");
    }

    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        BMW car = new BMW();
        car.move();
        car.sayHello();
        Ship ship = new Ship();
        ship.move();
        ship.sayHello();
    }
}
