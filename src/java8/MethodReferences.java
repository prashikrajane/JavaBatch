package java8;

import java.util.Arrays;
import java.util.List;

interface MyInterface {
    String msg();
}

public class MethodReferences {
    public static void main(String[] args) {
        MethodReferences obj = new MethodReferences();

        MyInterface myInterface = obj::show;
        System.out.println(myInterface.msg());

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.forEach(System.out::println);

    }

    public String show() {
        return "HEllO";
    }

}

