package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        deque.addFirst(5);
        deque.addLast(55);

//        System.out.println(deque.element());
//        System.out.println(deque.removeFirst());
//        System.out.println(deque.removeLast());
//        System.out.println(deque.size());
//        System.out.println(deque.removeFirstOccurrence(10));

        System.out.println(deque);

        for (Iterator<Integer> iterator = deque.iterator(); iterator.hasNext(); ){
            System.out.println(iterator.next());
        }
    }
}
