package collection;

import java.util.HashSet;
import java.util.Set;

public class SethashSetDemo {
    /*
    * Set does not follow the sequence of elements.
    * Set does not store the duplicate elements.
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);


//        System.out.println(set.remove(30));
//        System.out.println(set.size());
        System.out.println(set.add(80));
        System.out.println(set);


    }
}
