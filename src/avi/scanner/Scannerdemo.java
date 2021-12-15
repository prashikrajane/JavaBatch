                                           // Scanner (INPUT or OUTPUT)
/*
* Scanner is a pre-defined class in java which is available in java.util package.
* It is used to get user input.
 */
package avi.scanner;

import java.util.Scanner;

public class Scannerdemo {

    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number - ");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        System.out.println("Get Number - " + a);

    }

}
