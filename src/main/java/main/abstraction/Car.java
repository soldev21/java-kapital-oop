package main.abstraction;

public abstract class Car extends Vehicle {

    private String model;
    private String brand;
    private String color;

    public Car(String model,String brand,String color){
        this.model = model;
        this.brand=brand;
        this.color=color;
    }

    @Override
    public void sayHello(){
        System.out.println("Hello from car.");
    }

    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (!(o instanceof Car)) return false;
        Car c = (Car) o;
        return this.brand.equals(c.brand) && this.model.equals(c.model) && this.color.equals(c.color);
    }

}
