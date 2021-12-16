package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(12,54,54,65,65,54,884);
        showList(list1);

        List<String> list2 = Arrays.asList("Mayur", "Rahul", "Priya");
        showList(list2);

        List list3 = Arrays.asList(545, "sdsd", 's');
        showList(list3);
    }
    public static void showList(List<?> list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
