package avi.homework14;

public class Homework14a extends Homework14{   //abstract class 'extends' keyword is used.
    @Override                                  // interface class 'implements' keyword is used.
    void Show(){
        System.out.println("I live in Akot");
    }
}
class Demo{
    public static void main(String[] args){
        Homework14a r=new Homework14a();
        r.Show();
        r.Add();

    }
}
