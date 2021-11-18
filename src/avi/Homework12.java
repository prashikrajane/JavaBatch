                             // Ploymorphism -
                             // Compile time polymorphism - Method Overloading
/*
A polymorphism which exist at the time of compilation.
 */

package avi;

public class Homework12 {
    void add(){
        int a = 10,b = 20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int d, int e){
        int c;
        c=d+e;
        this.add();
        System.out.println(c);
    }
    void add(int a, double b){
        double c;
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args){
        Homework12 obj = new Homework12();
        obj.add(); obj.add(24,12); obj.add(50,40.23);
    }
}

/*
* Polymorphism is nothing but the same object having different behaviour.
 */