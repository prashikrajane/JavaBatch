package multithreading;

public class YieldDemo1 extends Thread{

    @Override
    public void run() {
        Thread.yield();
        for (int i =1;i<5;i++){
            System.out.println("It is run method");
        }

    }

    public static void main(String[] args) {

        YieldDemo1 yieldDemo1 = new YieldDemo1();
        yieldDemo1.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for(int i = 1;i<5;i++){
                    System.out.println("It is Thread 2");
                }
            }
        });
        t1.start();


        for (int i=1;i<5;i++){
            System.out.println("It is main method");
        }
    }
}
