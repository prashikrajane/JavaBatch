                                   // Hierarchial Inheritance
   /*

    */
package avi;

public class Homework11 {
    void input(){
        System.out.println("Tell me your name:- ");
    }

}
class Test extends Homework11{
    void disp(){
        System.out.println("My name is Rahul.");
    }

}
class Test2 extends Homework11{
    void show(){
        System.out.println("My name is Avi.");
    }

}
class test3{
    public static void main(String[] args) {

        Test r = new Test();
        Test2 r2 = new Test2();
        r.input();
        r.disp();
        r2.input();
        r2.show();
    }
}