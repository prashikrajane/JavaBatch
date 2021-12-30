package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Function<Integer, Integer> function = f->f*2;

        Stream<Integer> list1 = list.stream().map(function);
        list1.forEach(System.out::println);

        Predicate<Integer> predicate = p->p%2==0;
        Stream<Integer> list2 = list.stream().filter(predicate);
        list2.forEach(System.out::println);

    }
}
