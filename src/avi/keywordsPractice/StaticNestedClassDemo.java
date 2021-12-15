                                  // Static Nested class
/*
* Static nested class is the static member of the outer class, it can be accessed without instantiating the outer class
* , using other static member.
 */

package avi.keywordsPractice;

public class StaticNestedClassDemo {
    public static class NestedClass{                // Static nested class

        public void show(){

            System.out.println("Hii");
        }
    }

    public static void main(String[] args) {
        NestedClass obj = new NestedClass();   // Object creation for static nested class.
        obj.show();
    }
}
