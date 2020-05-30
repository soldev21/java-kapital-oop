package main.multithreading;

public class ObjectMethods {

    static Integer a = 0;
    static final Object lock = new Object();

    private static synchronized void increment() {
        a++;
    }

    public static void main(String[] args) throws InterruptedException {
//
//        a++;
//        a++;
//        System.out.println(a);

        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++)
//                increment();
                synchronized (lock) {
                    a++;
                }
            int a = 1;
        };
//
//        Thread thread = new Thread(runnable);
//        Thread thread2 = new Thread(runnable);
//        thread.start();
//        thread2.start();
//        thread.join();
//        thread2.join();
//        System.out.println(a);


    }
}
