package multithreading;

public class YieldDemo implements Runnable{

    @Override
    public void run() {
        Thread.yield();

        for(int i = 0; i<=5; i++){
            System.out.println("In run method");
        }
    }

    public static void main(String[] args) {
        YieldDemo obj = new YieldDemo();
        Thread t1 = new Thread(obj);
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<=5;i++){
                    System.out.println("In second thread");
                }
            }
        });
        t2.start();

        for(int i = 0; i<=5; i++){
            System.out.println("In main Thread");
        }
    }
}
