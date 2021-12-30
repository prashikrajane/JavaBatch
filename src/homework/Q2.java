package homework;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Q2 {
    public static void main(String[] args) {
        Arrays.asList("Pune", "Mumbai", "Nashik")
                .stream().map(m -> m.toLowerCase())
                .forEach(System.out::println);





        List<Integer> list = Arrays.asList(1,2,3,4,6,788);
        int max = 0;
        for(int i = 0; i< list.size();i++){
            if(max< list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);



    }
}