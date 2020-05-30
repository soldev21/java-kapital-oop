package main.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaPlayground {
    private static int e = 6;
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        final int c = 6;
        Consumer<Integer> consumer = (i) -> {
            System.out.println(i * c + " ");
            e=8;
//            c = 7;
        };
//        c=7;

//        BiConsumer<Integer, String> biConsumer = (i, j) -> {
//            System.out.println(i*5);
//            System.out.println(j.concat(" Bank!"));
//        };
//
//        biConsumer.accept(25,"Kapital");


        consumer.accept(5);

//        Runnable runnable = () -> System.out.println("Hello there!");
//        runnable.run();
//        Runnable runnable1 = () -> System.out.println("Runnable 2");
//        runnable1.run();
//
//        Consumer<Integer> consumer1 = new IteratorConsumer<>();
//
//
//        list.forEach(consumer);
//        list.forEach(consumer1);
//        list.forEach((i)->{
//            System.out.println(i*i*i);
//        });
//
//        list.forEach(new IteratorConsumer<>());
//
//        Supplier<Integer> supplier = () -> {
//
//            return 5;
//        };
//
//        int b = supplier.get();
//
//        MyFunctionalInterface myFunctionalInterface = (a) -> a*a;
//        useMyFunctionInterface(myFunctionalInterface,15);
//        useMyFunctionInterface((a)->a*a,15);
//
//        MyPrinter printer = (s) -> {
//            System.out.println("Before calling myFunction");
//            System.out.println(s);
//            System.out.println("After calling myFunction");
//        };
//        MyPrinter printer1 = System.out::println;
//        printer1.print("Salam Kapital Bank!");
//        printer.print("Salam Kapital Bank!");

    }


    private static void useMyFunctionInterface(MyFunctionalInterface myFunctionalInterface, int a) {
        int res = myFunctionalInterface.some(a);
        System.out.println("Result is: " + res);
    }

    public static void myPrintFunction(String s) {
        System.out.println(s + " printed with my function");
    }


}
