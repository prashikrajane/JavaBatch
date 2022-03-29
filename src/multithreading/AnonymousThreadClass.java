package multithreading;


class MultiDemo1{
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 1;  i<6; i++){
                System.out.println("hii");
            }
            System.out.println(Thread.currentThread().getPriority());

        });
        thread.start();
        System.out.println(Thread.currentThread().getPriority());

    }
}
