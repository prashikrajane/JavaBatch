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

public class Homework16 {
    String id; int password;

    public Homework16(){
        System.out.println("Account Details");
    }
    public Homework16(String id){
        System.out.println("Id==> " + "Prashik");
    }
    public Homework16(int password){
        System.out.println("Password==> " + 916845);
    }
}
class Trial{
    public static void main(String[] args){
        Homework16 r=new Homework16();
        Homework16 r2=new Homework16("prashik");
        Homework16 r3=new Homework16(1997);

    }
}
