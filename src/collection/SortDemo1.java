package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo1 implements Comparable<SortDemo1>{

        int id;
        String name;
        String address;

        public SortDemo1(int id, String name, String address){
            this.id = id;
            this.name = name;
            this.address = address;

        }

    public static void main(String[] args) {
        SortDemo1 obj1 = new SortDemo1(11, "Sanket", "Nagar");
        SortDemo1 obj2 = new SortDemo1(45, "Abhishek", "Pune");
        SortDemo1 obj3 = new SortDemo1(61, "Rahul", "Akola");

        List<SortDemo1> list = new ArrayList<SortDemo1>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);

        list.forEach(s -> {
            System.out.println("Id - " + s.id + ". Name - " + s.name + ". Address - " + s.address );
        });
    }

    @Override
    public int compareTo(SortDemo1 o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(SortDemo1 o) {
//        if(this.id == o.id){
//            return 0;
//        }else if(this.id>o.id){
//            return 1;
//        }else{
//            return -1;
//        }
//    }
}
