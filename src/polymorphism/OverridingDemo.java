                                      // Overriding
 /*
 Method Overriding - If two classes have same method name and same signature.
 Advantages -  We are implementing parent class into child class.

  */
package polymorphism;

public class OverridingDemo {

    public void sound(){
        System.out.println("Animal sound");
    }

}
class Dog extends OverridingDemo{

    public static void main(String[] args){
        Dog obj = new Dog();
        obj.sound();

    }
    @Override
    public void sound(){
        System.out.println("Dogs barks");
    }
}

