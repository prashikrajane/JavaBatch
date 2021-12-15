package exceptionhandling;

public class MethodOverriding {
    public void show() throws NullPointerException{                 // Hierarchy of exception.
        System.out.println("In Show");
    }
}
class Sample extends MethodOverriding{
    @Override
    public void show() throws NumberFormatException{
        super.show();


    }
}

/*
* If parent class declare exception then you can declare same exception in child.
* If parent class declare no exception then you can declare unchecked exception in child.
* If parent class declare unchecked exception then you can not declare parent in child.
 */
