package java8;

public class MethodReConstructor {
    public static void main(String[] args) {
        MyInterface1 myInterface1 = MethodReConstructor::new;
        myInterface1.methodRef();

    }
    MethodReConstructor(){
        System.out.println("In Constructor");
    }
}
interface MyInterface1{
    MethodReConstructor methodRef();

}
