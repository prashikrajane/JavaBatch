public class DeamonThreadDemo extends Thread{
    public static void main(String[] args) {

        DeamonThreadDemo d = new DeamonThreadDemo();
        d.setDaemon(true);
        d.start();
        System.out.println("In main");
        System.out.println(d.isDaemon());
    }

    @Override
    public void run() {
        System.out.println("In run");
    }
}
