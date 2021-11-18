                                     // Polymorphism
/*
The ability to take one form to many form.
One thing have many action.
<p>
*Method overloading - if a class have multiple method with same name but different number of arguments/ parameters.
*Rule==>
1) number of argument should br different
2) return type should br different.
*Advantage - It increases the readability of program.
 */
package polymorphism;

public class PolymorphismDemo {
    public double add(double a,int b){            // If double is a variable in method then the
        return (a+b);
    }

    public double add(double a, int b, int c){
        return a+b+c;
    }


    public static void main(String[] args){
        PolymorphismDemo obj = new PolymorphismDemo();
        double c= obj.add(2.5, 3, 5);

        System.out.println(c);
    }
}
