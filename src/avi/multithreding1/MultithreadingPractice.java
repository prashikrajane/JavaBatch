package avi.multithreding1;

public class MultithreadingPractice extends Thread{

    @Override
    public void run() {
        System.out.println("Run method of parent");
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        MultithreadingPractice m = new MultithreadingPractice();
        System.out.println(Thread.currentThread().getName());
        m.run();
    }
}
class B implements Runnable{

    @Override
    public void run(){
        System.out.println("Run method of child");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        B b = new B();
        Thread t1 = new Thread(b);
        t1.start();
    }

}
