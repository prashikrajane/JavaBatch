package avi;

import java.util.Scanner;

interface InterfaceDemo {
    void input();
    void output();

}
class Prashik implements InterfaceDemo{
    String name;
    int salary;



    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of employee -");
        name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the salary -");
        salary = scanner.nextInt();

    }

    @Override
    public void output() {
        System.out.println("The salary of " + name + " is " + salary);

    }

    public static void main(String[] args) {
        Prashik p = new Prashik();
        p.input();
        p.output();
    }
}
