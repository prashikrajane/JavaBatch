package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println(list.hashCode());

        Iterator<Integer> iterator = list.descendingIterator();
      //  while (iterator(list.hashCode()));

    }
}
