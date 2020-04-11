package main.abstraction;

import main.interfaces.SimpleInterface;

public abstract class Vehicle{
    public abstract void move();

    public void sayHello(){
        System.out.println("Hi everyone");
    }

    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        BMW bmw = new BMW("m3","bmw","red");
        BMW bmw1 = new BMW("m3","bmw","blue");
        System.out.println(bmw.equals(bmw1));
        SimpleInterface a;
    }

}
