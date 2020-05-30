package main.multithreading;

public class MyDaemon extends Thread {

    int counter;

    public MyDaemon(){
        init();
    }

    private void init(){
        setDaemon(true);
        setName("MyThread");
        counter = 0;
    }

    @Override
    public void run(){
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("MyThread "+(++counter));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyDaemon myDaemon = new MyDaemon();
        myDaemon.start();
        Thread.sleep(5000);
    }
}
