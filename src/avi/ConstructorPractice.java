                                  // Constructor
/*
* Constructors - It is a special type of function which invokes automatically when u create object of class.
*
* Rules to create constructor:-
* 1) Your class name and the constructor should be same.
* 2) There should be no explicit return type.
* 3) Static, final, synchronized keyword are not allowed with constructor.
*
* Types of constructor:-
* 1) Default constructor.
* 2) Parameterized constructor.
*
* Advantages of constructor:-
* It initializes the variable to their default value.
 */
package avi;

public class ConstructorPractice {
    String id; int password;

    public ConstructorPractice(){
        System.out.println("Account Details");
    }
    public ConstructorPractice(String id){
        System.out.println("Id==> " + "Prashik");
    }
    public ConstructorPractice(int password){
        System.out.println("Password==> " + 916845);
    }
}
class Trial1 {
    public static void main(String[] args){
        ConstructorPractice r=new ConstructorPractice();
        ConstructorPractice r2=new ConstructorPractice("prashik");
        ConstructorPractice r3=new ConstructorPractice(1997);

    }
}
