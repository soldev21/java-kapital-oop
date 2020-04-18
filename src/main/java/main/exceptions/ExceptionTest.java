package main.exceptions;

public class ExceptionTest {


    public static void main(String[] args) {
        Circle circle;
        try {
            circle = new Circle(5);
            System.out.println(circle.getRadius());

        } catch (RuntimeException r) {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(circle.getRadius());
        System.out.println("Program ended successfuly");
//        int a[] = new int[5];
//        for (int i=0;i<10;i++){
//            a[i]=i;
//        }
    }
}
