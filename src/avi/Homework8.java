                                    // Inheritance
                 /*
                  In inheritance the child class acquire the properties of parent class.
                  */
package avi;

public class Homework8 {             // Parent class

    String id ;
    int savings;
    int loan;

}
class SbiBank extends Homework8{      //1) Child class - Single level inheritance

    void Show(){

        SbiBank obj = new SbiBank();
         obj.id = "Rohan";
         obj.savings = 50000;
         obj.loan = 3000000;

        System.out.println(" id==> " + obj.id + " savings==> " + obj.savings + " loan==> " + obj.loan);

    }
}
class HdfcBank extends SbiBank{       //2) Child class - multilevel inheritance.

    void Print(){

        HdfcBank obj = new HdfcBank();

        obj.id = "Abhijeet";
        obj.savings = 250000;
        obj.loan = 500000;

        System.out.println(" id==> " + obj.id + " savings==> " + obj.savings + " loan==> " + obj.loan);
    }
}
class KotakBank extends Homework8{

    void State(){
        KotakBank obj = new KotakBank();
        obj.id = "Mayur";
        obj.savings = 1000000;
        obj.loan = 750000;

        System.out.println(obj.id +" " + obj.savings +" "+ obj.loan);

    }
}
class result{
    public static void main(String[] args){
        SbiBank obj = new SbiBank();
        HdfcBank obj1 = new HdfcBank();
        KotakBank obj2 = new KotakBank();
        obj.Show();
        obj1.Print();
        obj2.State();
    }
}