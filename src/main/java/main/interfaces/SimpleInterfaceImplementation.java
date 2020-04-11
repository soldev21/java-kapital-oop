package main.interfaces;

public class SimpleInterfaceImplementation implements SimpleInterface,InterfaceA,InterfaceB{
    public void helloWorld() {
        System.out.println("This is someMethod declared in SimpleInterface and implemented in SimpleInterfaceImplementation.");
    }

//    @Override
//    public void a() {
//        System.out.println("This is a() declared in SimpleInterface and implemented in InterfaceA.");
//    }

    @Override
    public void b() {
        System.out.println("This is b() declared in SimpleInterface and implemented in InterfaceB.");
    }
}
