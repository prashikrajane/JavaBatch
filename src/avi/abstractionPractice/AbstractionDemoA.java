package avi.abstractionPractice;

public class AbstractionDemoA extends AbstractionDemo {   //abstract class 'extends' keyword is used.
    @Override                                  // interface class 'implements' keyword is used.
    void Show(){
        System.out.println("I live in Akot");
    }
}
class Demo{
    public static void main(String[] args){
        AbstractionDemoA r=new AbstractionDemoA();
        r.Show();
        r.Add();

    }
}
