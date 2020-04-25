package main.interfaces;

import main.abstraction.BMW;

public interface InterfaceA {

    public static final int someInteger = 5;

    default void a(){
        System.out.println("Iam declared in InterfaceA");
    }
}
