package avi.multithreding1;

public class InterrthreadCommDemo {

        int num;

        public void setNum(int i){
            System.out.println("SetNUm:" + i);
            this.num=i;
        }

        public void getNum(){
            System.out.println("GetNum:" + num);
        }

}

class Producer implements Runnable{

    public InterrthreadCommDemo interrthreadCommDemo;

    public Producer(InterrthreadCommDemo interrthreadCommDemo){
        this.interrthreadCommDemo = interrthreadCommDemo;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            interrthreadCommDemo.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Consumer implements Runnable{

    public InterrthreadCommDemo interrthreadCommDemo;

    public Consumer(InterrthreadCommDemo interrthreadCommDemo){
        this.interrthreadCommDemo = interrthreadCommDemo;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        while(true){
            interrthreadCommDemo.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Main{
    public static void main(String[] args) {
        InterrthreadCommDemo interrthreadCommDemo = new InterrthreadCommDemo();

        Producer producer = new Producer(interrthreadCommDemo);
        Consumer consumer = new Consumer(interrthreadCommDemo);
    }

}
