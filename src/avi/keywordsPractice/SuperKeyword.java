                                       // "Super" keyword
/*
* Super keyword is used to call the parent constructor, parent method, parent variables.
*/


package avi.keywordsPractice;

public class SuperKeyword {
    int a = 10;
    SuperKeyword(){
        System.out.println("Parent class constructor");
    }
    public void show(){
        System.out.println("Parent class method");
    }
}

class B extends SuperKeyword{
    int a = 20;
    B(){
        super();

        System.out.println("Child class constructor");
    }
    public void show(){
//        System.out.println(a);
//        System.out.println(super.a);
        System.out.println("Child class method");
        super.show();
    }
}
class C{
    public static void main(String[] args) {
        B b = new B();
       // b.show();

    }
}