package abstraction.abstractiondemo1;

public class Vivo extends Oppo{
    @Override
    public void call() {
        System.out.println("Clear voice than oppo mobile phone");
    }
    @Override
    public void msg(){
        System.out.println("You will get unlimited msg services");
    }
    @Override
    public void camera(){
        System.out.println("You will get front 16 and rear 64.");
    }
}
class Result{
    public static void main(String[] args){
        Vivo r=new Vivo();
        r.call();
        r.msg();
        r.camera();
        r.whatsapp();
    }

}

