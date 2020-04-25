package main.model;

/**
 * Created by Sherif on 2/29/2020.
 */
public class SuperClass {

    static int staticVariable =15;
    private int a;
    protected int b;
    public int c;

    public SuperClass(){

    }

    /*Never override this method.*/
    public final void finalMethod(){
        System.out.println("I'am final method.");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static void staticMethod(){
        System.out.println("B's static method.");
    }
}
