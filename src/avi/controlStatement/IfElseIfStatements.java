                                  // IfElseIf statements
/*
* It is used when we have multiple condition.
 */

package avi.controlStatement;

import java.util.Scanner;

public class IfElseIfStatements {
    public static void main(String[] args) {
        int marks;
        System.out.println("Enter your number -");
        Scanner r = new Scanner(System.in);
        marks = r.nextInt();

        if(marks>=90){
            System.out.println("Distinction");
        }else if(marks>=80){
            System.out.println("First class");
        }else if(marks>=70){
            System.out.println("Second class");
        }else{
            System.out.println("fail");

        }
    }
}
