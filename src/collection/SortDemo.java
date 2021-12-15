package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,88, 65, 32, 54, 95, 78);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}

