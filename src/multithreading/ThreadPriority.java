package multithreading;

public class ThreadPriority {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread t1 ");
            }
        });
//        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        //        t1.setPriority(5);
        System.out.println( t1.getPriority());


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread t2");
            }
        });
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
//        t2.setPriority(10);
        System.out.println(t2.getPriority());


    }
}
