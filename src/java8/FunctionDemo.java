package java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer i = 9;
        Function<Integer,Integer> function = f->f*2;
        System.out.println(function.apply(i));

        String str = "Prashikrr";
        Function<String,Integer> function1 = f1->f1.length();
        System.out.println(function1.apply(str));
    }
}
