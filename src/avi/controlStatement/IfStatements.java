                                           // 'If' statement
/*
* 'If' statement is used to only check the condition.
*/

package avi.controlStatement;


import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
//        int a = 21;
//        int b = 32;
//        int c = b - a;
//        if(c == 11){
//
//            System.out.println("Answer is " + c);
//        }
//        System.out.println("Condition is true");
//_______________________________________________________________________________________________________________________
        int a;
        int b;

        System.out.println("Enter the value");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        int c = a - b;
        if(c >= 10){
            System.out.println("Your answer is greater than 10");

        }
        System.out.println("Your Welcome");
    }
}
