package main.multithreading;

public class MultiThreadingPlayground {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        Thread thread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()){
//                    Thread.sleep(1000);
                    System.out.println("Another thread.");
                }
                System.out.println("Another Thread ENDED");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);

        Thread thread2 = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()){
//                    Thread.sleep(500);
                    System.out.println("Another thread 2.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread2.setDaemon(true);

        thread.start();
        thread2.start();
//        thread.join();
//        thread2.join();

        Thread.sleep(10);
        thread.interrupt();

        System.out.println("Program Ended successfully");
        Thread.sleep(1);


    }
}
