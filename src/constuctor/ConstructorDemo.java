package constuctor;
/*
* Constructor -  It is  special type of function which invoke automatically when
* you create object of class.
*
* Rules to create Constructors -->
* 1) Your class name and Constructors should br same.
* 2) There should be no explicit return type.
* 3) Static, final, synchronized keyword are not allowed with constructors.
*
* Types of constructors -->
* 1) Default constructors
* 2) Parameterized constructors
*
* Advantages of constructors -
* it initializes the variable to their default value.
 */

public class ConstructorDemo {
    int i;
    String string;

    public ConstructorDemo(){
        System.out.println("In default constructor");
    }
    public ConstructorDemo(String str){
        this();
        System.out.println("String constructor" + str);
    }
    public ConstructorDemo(int i){
        System.out.println(525);
    }
    public ConstructorDemo(int i, int j){
        System.out.println(i+j);
    }
    public static void main(String[] args) {
        ConstructorDemo r = new ConstructorDemo();
        ConstructorDemo r2 = new ConstructorDemo(54, 55);
       // r.ConstructorDemo();
    }
}
