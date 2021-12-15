package multithreading;

public class MultithreadingPractice extends Thread {
    @Override
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class Practice extends Thread{

    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
class Run{
    public static void main(String[] args) {
        MultithreadingPractice obj = new MultithreadingPractice();
        Practice obj1 = new Practice();

        obj.start();
        obj1.start();
    }
}