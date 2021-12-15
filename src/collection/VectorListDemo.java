package collection;

import java.util.List;
import java.util.Vector;

public class VectorListDemo {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}


