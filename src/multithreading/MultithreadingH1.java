package multithreading;

public class MultithreadingH1 extends Thread{

    @Override
    public void run() {
        for (int i =1;i<=5;i++){
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
class MultithreadingH2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1;i<=5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
class ThreadResult{
    public static void main(String[] args) {
        MultithreadingH1 multithreadingH1 =new MultithreadingH1();
        MultithreadingH2 multithreadingH2 = new MultithreadingH2();
        Thread thread =new Thread(multithreadingH2);


        multithreadingH1.start();
        thread.start();

    }
}
