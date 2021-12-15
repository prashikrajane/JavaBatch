                                    // Type Casting
package avi;

public class TypeCasting {

    public static void main(String[] args){
        int a = 45;                  // 4 byte
        double b = a;                // 8 byte                   // Implicit type casting.


        double d = 54.5;                // 8 byte
        int c = (int)d;                 // 4 byte                        // Explicit type casting


         System.out.println(c);
         System.out.println(b);
    }
}
/*
Type casting is the process of converting one datatype into another datatype.
There are following two types:-
1) Implicit type casting - To convert small datatypes value into big datatypes value. It is automaticall
                           perform by compiler.
2) Explicit type casting - To convert big datatypes values into small dataatypes value. We have to do it manually.
 */