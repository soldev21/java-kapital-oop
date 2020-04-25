package main.abstraction;

public class BMW extends Car{

    public BMW(String model,String brand,String color){
        super(model,brand,color);
    }
    public void move() {
        System.out.println("I'am a moving BMW :)");
    }
}
