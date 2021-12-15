package multithreading;

public class LambdaExpression {
    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {

                for(int i = 0; i <5;i++) {
            System.out.println("hii");

                }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i<5;i++){
                System.out.println("Hello");
        }
        });

        t1.start();
        t2.start();
    }
}
