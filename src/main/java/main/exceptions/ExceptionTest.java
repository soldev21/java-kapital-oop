package main.exceptions;

import java.io.IOException;

public class ExceptionTest {


    public static void main(String[] args) throws ExceptionB {
        Circle circle = null;
        try {
            System.out.println("Hello");
        }finally {

        }



        try {
            circle = new Circle(-5);
            System.out.println(circle.getRadius());
        }catch (ExceptionC | ExceptionB r) {
//            System.out.println("Handled in ExceptionC clause");
//            System.out.println(r.getMessage());
            throw new RuntimeException("exception group a");

        }
//        catch (ExceptionB r) {
//            System.out.println("Handled in ExceptionB clause");
//            System.out.println(r.getMessage());
//            throw r;
//        }
        catch (Exception ex) {
            System.out.println("Handled in Exception clause");
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println("Program ended successfully");
//        int a[] = new int[5];
//        for (int i=0;i<10;i++){
//            a[i]=i;
//        }
    }
}
