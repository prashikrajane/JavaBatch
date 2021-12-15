package multithreading;

public class MultithreadingDemo extends Thread{    // only inheritance one class via extends thread.
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("In run");
    }


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();


    }
}
class Hello implements Runnable{                    // multiple class can be inheritance via implements Runnable.

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In run");


    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Hello hello = new Hello();
        Thread t1 = new Thread(hello);
        t1.start();

        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }
}
