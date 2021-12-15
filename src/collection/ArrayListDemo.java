package collection;

import java.util.*;

public class ArrayListDemo {

    // Arraylist stores duplicate value
    /*
    Arraylist maintain insertion order
    Arraylist uses dynamic array to store elements.
     */
    public static void main(String[] args) {
        int[] arr = {545, 45, 45, 45, 4};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.size());
        System.out.println(list.remove(1));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        list.forEach(s -> {
            System.out.println(s);
        });

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(54);
        list1.add(54);
        list1.add(54);
        list1.add(54);
        System.out.println(list1);

        List<Integer> list2 = Arrays.asList(54, 4, 5, 4, 54);


    }
}


