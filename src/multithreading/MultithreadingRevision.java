package multithreading;

public class MultithreadingRevision extends Thread{
    @Override
    public void run() {

        for (int i =1; i<=5; i++){

            System.out.println("Hello");

        }
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        MultithreadingRevision multithreadingRevision = new MultithreadingRevision();
        multithreadingRevision.start();
        System.out.println(Thread.currentThread().getName());

    }
}

class MultithreadingDemo2 implements Runnable{


    @Override
    public void run() {
        for (int i =1; i<=5; i++){

            System.out.println("Hello");

        }
        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String[] args) {
        MultithreadingDemo2 multithreadingDemo2 = new MultithreadingDemo2();
        Thread thread = new Thread(multithreadingDemo2);
        thread.start();

    }
}
