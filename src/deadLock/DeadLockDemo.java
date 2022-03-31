package deadLock;

public class DeadLockDemo {
    public static void main(String[] args) {

        String resources1 = "Printer";
        String resources2 = "Scanner";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(resources1){
                    System.out.println(Thread.currentThread().getName()+ "Locked" + resources1);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    synchronized (resources2) {
                        System.out.println(Thread.currentThread().getName() + "Locked" + resources2);
                    }

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resources2){
                    System.out.println(Thread.currentThread().getName() + "Locked" + resources2);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resources1){
                        System.out.println(Thread.currentThread().getName() + "Locked" + resources1);
                    }
                }


            }
        });
        t1.setName("Laptop");
        t2.setName("Desktop");

        t1.start();
        t2.start();


    }

}
