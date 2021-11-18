                                    // Access modifier/specifier
package avi;

public class Homework6 {

          public int a = 21;         //  Private,Protected,Public,Default.

    public static void main(String[] args){

        Homework6 obj = new Homework6();

        System.out.println(obj.a);

    }
}
/*
Access modifier/specifier is used to set access and regulates access to class, constructors,
methods and other members in java.
There are four types of access modifier/specifier:-
1) Public - Gives access in the whole project.
2) Private - Gives access within a class.
3) Protected - Gives access within a package and through inheritance gives access outside the package.
4) Default -  Don't need to type default, it automatically reads default.
 */
