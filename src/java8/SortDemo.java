package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(15,65,45,65,4,54,45);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
