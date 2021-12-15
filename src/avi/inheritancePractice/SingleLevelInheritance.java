                                     //  Simple/Single level inheritance
 /*
 In single level inheritance only one sub-class is occupies the properties of the parent class.
 The 'extends' keyword is used to perform inheritance.

  */
package avi.inheritancePractice;

public class SingleLevelInheritance {             // Parent class

    int roll, marks;
    String name;

}
class student extends SingleLevelInheritance {           // Child class

    int roll = 5, marks = 50;
    String name = "Prashik";

    public static void main(String[] args){
        student obj = new student();

        System.out.println("roll==>" + obj.roll + "marks==>" + obj.marks + "name==>" + obj.name);
    }

}
