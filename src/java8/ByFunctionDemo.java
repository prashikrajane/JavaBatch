package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class ByFunctionDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        Predicate<Integer> predicate = p->p%2==0;

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> biFunction = new BiFunction<List<Integer>, Predicate<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> integers, Predicate<Integer> integerPredicate) {
                List<Integer> list1 = new ArrayList<>();

                for(Integer i :list){
                    if (integerPredicate.test(i)){
                        list1.add(i);
                    }
                }
                return list1;

            }
        };
        System.out.println(biFunction.apply(list, predicate));
    }
}
