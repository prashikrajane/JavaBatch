package multithreading;

public class MultithreadingName extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }


}
class M1 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}
class M2{
    public static void main(String[] args) {
        MultithreadingName obj = new MultithreadingName();
        M1 m = new M1();


        obj.setName("Imp Thread");
        obj.start();
        m.start();
    }

}
