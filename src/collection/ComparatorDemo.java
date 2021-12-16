package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String address;

    public ComparatorDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        ComparatorDemo obj = new ComparatorDemo(45, "Prashik", "Akot");
        ComparatorDemo obj1 = new ComparatorDemo(4, "Akash", "Nagar");
        ComparatorDemo obj2 = new ComparatorDemo(49, "Rahul", "Pune");

        List<ComparatorDemo> list = new ArrayList<ComparatorDemo>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);

        Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo o1, ComparatorDemo o2) {
                if (o1.id == o2.id) {
                    return 0;
                } else if (o1.id > o2.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(list, comparator.thenComparing((ComparatorDemo o1, ComparatorDemo o2)->{
            return o1.name.compareTo(o2.name);
        }));
        list.forEach(s -> {
            System.out.println("Id " + s.id + " Name " + s.name + " Address " + s.address);
        });
    }


}
