package main.multithreading;

public class MultiThreadingPlayground {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1000);
                    System.out.println("Another thread.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);

        Thread thread2 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(500);
                    System.out.println("Another thread 2.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread2.setDaemon(true);

        thread.start();
        thread2.start();

        System.out.println("Program Ended successfully");
        Thread.sleep(5000);
    }
}
