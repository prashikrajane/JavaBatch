package avi.controlStatement;

import java.util.Scanner;

public class NestIfElseStatements {
    public static void main(String[] args) {
        int maths;
        int science;
        int english;

        Scanner r = new Scanner(System.in);
        System.out.println("Enter maths marks");
        maths = r.nextInt();
        System.out.println("Enter science marks -");
        science = r.nextInt();
        System.out.println("Enter english marks - ");
        english = r.nextInt();

        if(maths >= 50){
            System.out.println("Pass in maths");
        }else {
            System.out.println("Fail in maths");
        }
        if(science>=50){
            System.out.println("Pass in science");
        }else{
            System.out.println("Fail in science");
        }
        if(english>=50){
            System.out.println("Pass in english");
        }else{
            System.out.println("Fail in english");
        }

        System.out.println("Your Welcome");

    }
}
