package multithreading;

public class ProducerConsumer{

    int num;
    boolean flag = true;

    public synchronized void setNum(int num) {

       if (!flag){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

        System.out.println("Set num " + num);
        this.num = num;
        flag=true;
        notify();
    }

    public synchronized void getNum() {
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get num " + num);
        flag=false;
        notify();


    }

}

class Producer2 implements Runnable{
    ProducerConsumer producerConsumer;
    Producer2(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;

    }

    @Override
    public void run() {
        int num = 1;

        while (true){
            producerConsumer.setNum(num++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class Consumer2 implements Runnable{
    ProducerConsumer producerConsumer;
    Consumer2(ProducerConsumer producerConsumer){
        this.producerConsumer=producerConsumer;

    }

    @Override
    public void run() {

        while(true){
            producerConsumer.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
class Main2{
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer2 producer2 =new Producer2(producerConsumer);
        Consumer2 consumer2 = new Consumer2(producerConsumer);
        Thread thread1 = new Thread(producer2);
        Thread thread2 = new Thread(consumer2);
        thread1.start();
        thread2.start();
    }





}

