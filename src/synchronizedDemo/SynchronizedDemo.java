package synchronizedDemo;

public class SynchronizedDemo {
    int num;

    public static void main(String[] args) {

        SynchronizedDemo obj = new SynchronizedDemo();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj.increase();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    obj.increase();
                }

            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(obj.num);
    }

    //    public synchronized void increase(){
//        num++;
//    }
    public void increase() {
        synchronized (this) {
            num++;
        }
    }
}
