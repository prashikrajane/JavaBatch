package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Students {
    int id;
    String name;
    int marks;

    Students(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    public static void main(String[] args) {
        Students s1 = new Students(1, "Prashik", 52);
        Students s2 = new Students(2, "Mayur", 34);
        Students s3 = new Students(3, "Dhaval", 67);
        Students s4 = new Students(4, "Sanket", 34);

        List<Students> list  = new  ArrayList<Students>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        list.forEach(s->{
            System.out.println("ID -" + s.id + " Name -" + s.name + " Marks -" + s.marks);
        });

        Predicate<Students> predicate = f->f.marks==34;
        Function<Students, Integer> function = m->m.marks+1;

        list.stream()
                .filter(f->f.marks==34)
                .map(m->m.marks+1)
                .collect(Collectors.toList())
                .forEach(System.out::println);





    }

}
