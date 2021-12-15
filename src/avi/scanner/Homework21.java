// ATM PIN program for balance check

package avi.scanner;

import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
        int password = 1997;
        System.out.println("Enter your password-");
        Scanner r = new Scanner(System.in);
        password = r.nextInt();


        if (password == 1997) {
            System.out.println("Your password is correct");
            System.out.println("Your bank balance is 200000Rs");


        } else {
            System.out.println("Your password is incorrect");
            System.out.println("Please try again");

        }


        System.out.println("*****Your Welcome*****");

    }
}
