package main.model;

/**
 * Created by Sherif on 2/29/2020.
 */
public class SubClass extends SuperClass {

    static int staticVariable = 16;

    private int d;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public static void staticMethod(){
        System.out.println("A's static method.");
    }

//    @Override
//    public void finalMethod(){
//        System.out.println("I'am overridden final method.");
//    }

    public static void main(String[] args) {
//        System.out.println(SubClass.staticVariable);
//        System.out.println(SuperClass.staticVariable);
//        SubClass.staticMethod();
//        SuperClass.staticMethod();

        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();
        superClass.finalMethod();
        subClass.finalMethod();
    }
}
