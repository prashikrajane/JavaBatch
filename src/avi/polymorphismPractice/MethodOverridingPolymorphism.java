                          // Polymorphism
                          // Runtime polymorphism - Method overriding
package avi.polymorphismPractice;

public class MethodOverridingPolymorphism {
    void shape(){
        System.out.println("Don't know which shape");
    }
}
class Demo extends MethodOverridingPolymorphism {
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
