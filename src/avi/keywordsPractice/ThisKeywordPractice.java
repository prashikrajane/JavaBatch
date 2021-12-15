                                     // "this" keyword
/*
1) "this" keyword refers to the current object inside a method or constructor.
2) Whenever the name of instance and local variable is same then our runtime environment JVm gets confused that
   which one is local variable and which one is instance variable, to avoid this problem we should use this keyword.
3) It is also used when we want to call the default constructor of its own class.
4) It is also called parameterized constructor of its own class
 */

package avi.keywordsPractice;

public class ThisKeywordPractice {
//    void Show  (){                                  // In this syntax this is used to show the unique variable reference.
//        System.out.println(this);
//    }
//    public static void main(String[] args) {
//        Homework17 obj = new Homework17();            // After calling the object u will see the same unique reference variable
//        obj.Show();
//        System.out.println(obj);
//    }

//----------------------------------------------------------------------------------------------------------------------

    int a;
    ThisKeywordPractice(int a){                       // Confusion of instance and local variable
        this.a=a;                            // Use this keyword, it always represents the instance variable.
    }
    void Show(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisKeywordPractice r=new ThisKeywordPractice(54);
        r.Show();
    }

//---------------------------------------------------------------------------------------------------------------------

//    ThisKeywordPractice(){
//        System.out.println("Hello");
//    }
//    ThisKeywordPractice(int a){
//        this();                            // we can call default constructor by using this keyword.
//        System.out.println(a);             // same as go for parameterized constructor
//    }
//
//    public static void main(String[] args) {
//        ThisKeywordPractice r = new ThisKeywordPractice(21);
//    }
}
