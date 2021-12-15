package multithreading;

public class InterThreadCommDelay {
    int num;
    boolean flag = true;

    public synchronized void setNum(int num){
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Set:" + num);
        this.num = num;
        flag = false;
        notify();
    }

    public synchronized void getNum(){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("GetNum:" + num);
        flag = true;
        notify();
    }

}
class Producer1 implements Runnable{
    public InterThreadComm interThreadComm;

    public Producer1(InterThreadComm interThreadComm){
        this.interThreadComm = interThreadComm;

        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int i = 0;

        while(true) {
            interThreadComm.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Consumer1 implements Runnable{
    public InterThreadComm interThreadComm;

    public Consumer1(InterThreadComm interThreadComm){
        this.interThreadComm = interThreadComm;

        Thread t1 = new Thread(this);
        t1.start();
    }


    @Override
    public void run() {
        while(true){
            interThreadComm.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
class Main1 {
    public static void main(String[] args) {
        InterThreadComm interThreadComm = new InterThreadComm();

        Producer producer = new Producer(interThreadComm);

        Consumer consumer = new Consumer(interThreadComm);
    }

}

