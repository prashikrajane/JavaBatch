package package1;

public class Sbi implements Rbi {
    @Override
    public void Show(){
        int a = 25; int b = 35;
        int c = a+b;
        System.out.println("Show the value of c " + c);
    }
    public static void main(String[] args){
        Sbi r=new Sbi();
        r.Show();
    }









}
