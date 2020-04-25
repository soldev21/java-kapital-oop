package main.polymorphism;

import java.io.IOException;

public class PolymorphismPlayground {
    public static void main(String[] args) {
//        SuperClass superClassObj = new SuperClass();
//        superClassObj.superClassMethod();

//        SubClassA subClassAObj = new SubClassA();
//        subClassAObj.superClassMethod();
//        subClassAObj.subClassAMethod();

//        SubClassB subClassBObj = new SubClassB();
//        subClassBObj.superClassMethod();
//        subClassBObj.subClassBMethod();
//
//        SuperClass superClass = new SuperClass();
        SuperClass superClassA = new SubClassA();
        Exception ex = new IOException("some error");
        SuperClass superClassB = new SubClassB();
//
        superClassA.superClassMethod();
        superClassB.superClassMethod();
    }
}
