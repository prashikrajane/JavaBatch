                                  // Multilevel Inheritance
   /*

    */
package avi;

public class Homework10 {
    int a,b,c;
    void add(){
         a = 12; b = 23;
         c = a+b;
       System.out.println("Add the two number- "+ c);
    }
    void sub(){
        a = 50; b = 25;
        c = a-b;
        System.out.println("Sub the two number- "+ c);
    }
}
class A extends Homework10{

    void multi(){
        a = 10; b = 20;
        c = a*b;
        System.out.println("Multiplication of two number- "+ c);
    }
    void div(){
        a = 100; b = 10;
        c = a/b;
        System.out.println("Division the two number- "+ c);
    }
}
class B extends A{
    void rem(){
        a = 100; b = 21;
        c = a%b;
        System.out.println("Reminder the two number- "+ c);

    }
}
class C extends B{
    public static void main(String[] args){
        B obj = new B();
        obj.add(); obj.sub(); obj.multi(); obj.div(); obj.rem();
    }
}