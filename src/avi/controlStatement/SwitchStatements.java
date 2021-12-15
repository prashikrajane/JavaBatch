                                 // Switch statements
/*
* It is used when we have multiple choices of condition, but we want to execute only one and break the chain.
 */

package avi.controlStatement;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        int ch;
        System.out.println("Enter your ch");
        Scanner r = new Scanner(System.in);
        ch = r.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Sum" + (a + b));
                break;
            case 2:
                System.out.println("Sub" + (a - b));
                break;
            case 3:
                System.out.println("Multi" + (a * b));
                break;
            case 4:
                System.out.println("Div" + (a / b));
                break;
            default:
                System.out.println("Out of Switch");


        }

    }
}
