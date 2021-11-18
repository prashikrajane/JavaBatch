                                    // Variables
package avi;

public class Homework4 {

    static int a = 25;            // Static variable
    int b = 54;                   //  Instance variable

    public static void main(String[] args) {

        int c = 21;                 // Local variable

       Homework4 obj = new Homework4();

        System.out.println(obj.b);
        System.out.println(a);
        System.out.println(c);
    }
}

/*
Variable is a data item whose value can change during the program execution.
There are three types of variables:-
1) Local variable - It is declared inside the body of method.
2) Instance variable - It is declared inside the class.You have to create object to get result.
3) Static variables - It is declared with the help of 'static' keyword.
 */