package synchronizedDemo;

public class SynchronizedDemo1 {
    int num = 0;
    public void increase(){
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo1 synchronizedDemo1 = new SynchronizedDemo1();
        Thread t1 = new Thread(()->{
            for (int i = 1; i<=1000;i++){
                synchronizedDemo1.increase();
            }
        });

        Thread t2 =new Thread(()->{
            for (int i =1;i<=1000;i++){
                synchronizedDemo1.increase();
            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(synchronizedDemo1.num);
    }
}
