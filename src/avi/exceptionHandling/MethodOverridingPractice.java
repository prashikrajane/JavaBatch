package avi.exceptionHandling;

public class MethodOverridingPractice {
    public void show() throws NullPointerException{
        System.out.println("Parent method");
    }
}
class A extends MethodOverridingPractice{
    @Override
    public void show() throws NumberFormatException{
       super.show();
        System.out.println("Child class");

    }

    public static void main(String[] args) {
        A a = new A();
        a.show();
    }

}
