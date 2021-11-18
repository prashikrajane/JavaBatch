                          // Polymorphism
                          // Runtime polymorphism - Method overriding
package avi;

public class Homework13 {
    void shape(){
        System.out.println("Don't know which shape");
    }
}
class Demo extends Homework13{
    @Override
    void shape(){
        System.out.println("Square shape");
    }
}
class Reharsal{
    public static void main(String[] args){
        Demo r = new Demo();
        r.shape();
    }
}
