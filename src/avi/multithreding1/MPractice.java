package avi.multithreding1;

public class MPractice extends Thread {
    @Override
    public void run(){
        System.out.println("New thread execution");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MPractice obj = new MPractice();
        System.out.println(Thread.currentThread().getName());
        obj.start();
    }
}
class Hello implements Runnable{

    @Override
    public void run() {
        System.out.println("Child class thread ");
        System.out.println(Thread.currentThread().getName());
    }

    public void main(String[] args) {
        Hello h = new Hello();
        Thread t1 = new Thread(h);
//        t1.start();

        MPractice obj = new MPractice();
        obj.start();
        t1.start();
    }
}
