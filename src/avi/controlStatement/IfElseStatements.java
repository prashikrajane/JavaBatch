                                    // IfElse statement
/*
* It is used to execute two statements.
 */

package avi.controlStatement;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
//        int age = 18;
//
//        if(age >= 18){
//            System.out.println("You can vote");
//        }else{
//            System.out.println("You can not vote");
//        }
//----------------------------------------------------------------------------------------------------------------------
          int  a;
        System.out.println("Enter the number");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        if(a >= 0) {                                             // Without using curly braces program runs
            System.out.println("Entered number is positive");
        }else{
            System.out.println("Entered number is negative");
        }

    }
}
