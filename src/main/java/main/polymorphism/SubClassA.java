package main.polymorphism;

public class SubClassA extends SuperClass {
    public void subClassAMethod(){
        System.out.println("This is SubClassA.subClassAMethod().");
    }

    @Override
    public void superClassMethod(){
        System.out.println("This is SuperClass.superClassMethod() overridden in SubClassA.\n");
    }
}
