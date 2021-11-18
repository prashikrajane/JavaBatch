package abstraction.abstractiondemo1;

public class Oppo extends Mobile{

    @Override
    public void call(){
        System.out.println("You can call anywhere");
    }
    @Override
    public void msg(){
        System.out.println("There is a limit for msg");
    }
    public void camera(){
        System.out.println("Camera specification is front 8 and rear 64 ");
    }

}
class Demo {
    public static void main(String[] args) {
        Oppo obj = new Oppo();
        obj.call();
        obj.msg();
        obj.camera();

        obj.whatsapp();
    }
}