package java8;

import java.util.function.Predicate;

public class Predicatedemo {
    public static void main(String[] args) {
        Integer i = 10;
        Predicate<Integer> predicate = integer -> integer<0;
        System.out.println(predicate.test(i));
    }
}
