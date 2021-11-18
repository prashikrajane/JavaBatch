                                     // Abstraction
/*
Abstraction is the process of hiding the implements details from the user.Only highlighted set of services provided
to the user.
There are two types of Abstraction:-
1) Abstract class - A class which is declared by abstract keyword. And it can have both abstract and non-abstract method.
                    You have to extend the abstract class.
2) Interface class - A class which declared by interface keyword. And it contains only declaration of method.
                    You have to implement the class.
 */
package avi.homework14;

public abstract class Homework14 {       // You can create interface class using interface keyword.
    abstract void Show();                // Declaration of method.
    public void Add(){                   // Declaration of method with definition. In interface method u can not write
       int a = 23;                       //   definition of method.
       String name = "Prashik";
       System.out.println(a +" "+name);
    }
}
/*
* Yuo can not create object of abstract class.
 */