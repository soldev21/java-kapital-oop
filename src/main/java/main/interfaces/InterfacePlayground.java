package main.interfaces;

import java.sql.SQLOutput;

public class InterfacePlayground {
    public static void main(String[] args) {
        SimpleInterfaceImplementation implementation = new SimpleInterfaceImplementation();
        implementation.helloWorld();
        implementation.a();
        implementation.b();
        System.out.println(InterfaceA.someInteger);
    }
}
