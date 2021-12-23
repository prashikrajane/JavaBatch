package java8;

public class MethodReStatic {
    public static void main(String[] args) {
        MyInterface2 myInterface2 = MethodReStatic::add;
        System.out.println(myInterface2.show());
    }
    public static String add(){
        return "Prashik";
    }
}
interface MyInterface2{
    String show();
}