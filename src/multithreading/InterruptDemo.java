package multithreading;

public class InterruptDemo extends  Thread{
    @Override
    public void run() {
        for(int i = 1; i<5;i++){
            System.out.println("It is run method");
        }
    }

    public static void main(String[] args) {
        InterruptDemo interruptDemo =new InterruptDemo();
        interruptDemo.start();
//        interruptDemo.interrupt();

        for (int i = 1; i<5;i++){
            System.out.println("It is main method");
        }
    }
}
