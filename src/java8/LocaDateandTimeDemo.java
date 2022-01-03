package java8;

import java.time.LocalDate;
import java.util.Date;

public class LocaDateandTimeDemo {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//
//        System.out.println(System.currentTimeMillis());
//        Date date1 = new Date(1641192985384l);
//        System.out.println(date1);

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.minusDays(2));
        System.out.println(localDate.plusDays(2));
    }
}
