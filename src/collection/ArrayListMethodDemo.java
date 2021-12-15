package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(70);
        list1.add(50);
        list1.add(60);


//        list.addAll(list1);
//        list.removeAll(list1);
        list.retainAll(list1);
        System.out.println(list);
    }
}
