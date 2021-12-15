package avi.controlStatement;

import java.util.Scanner;

public class WhileloopInfiniteDemo {
    public static void main(String[] args) {
        int i ;
        System.out.println("Enter the condition");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();

        while (i>=0){
            System.out.print("learn coding");
        }
    }
}

