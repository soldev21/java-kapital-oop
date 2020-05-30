package main.multithreading;

import java.util.UUID;
import java.util.concurrent.*;

public class ExecutorServicePlayground {
    static Integer a = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable runnable = () -> {

            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

//        for (int i = 0; i < 100; i++)
//            executorService.execute(runnable);
        Future<String> future = executorService.submit(() -> {
            System.out.println("Starting callable!");
            Thread.sleep(3000);
            return UUID.randomUUID().toString();
        });

//        try {
//            String s = future.get();
//            System.out.println(s);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


//        Runnable runnable1 = () -> {
//            System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//        ScheduledExecutorService executorService1 = Executors.newScheduledThreadPool(3);
//        executorService1.scheduleAtFixedRate(runnable1,1,1, TimeUnit.SECONDS);
////        executorService1.scheduleAtFixedRate(runnable1,1,1, TimeUnit.SECONDS);
        executorService.shutdown();
        executorService.awaitTermination(4,TimeUnit.SECONDS);
        System.out.println("Program Ended successfully");
    }
}
