package java8;

import javax.sound.midi.Soundbank;
import java.time.*;

public class ZoneDateAndTimeDemo {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        System.out.println(zoneId);

        LocalDate localDate1 = LocalDate.now(zoneId);
        System.out.println(localDate1);

        LocalTime localTime2 = LocalTime.now(zoneId);
        System.out.println(localTime2);

        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        System.out.println(localDateTime);


        LocalDate from = LocalDate.of(2021, 12, 20);
        LocalDate to = LocalDate.of(2022, 1, 3);

        Period period = Period.between(from,to);
        System.out.println(period);

        LocalDateTime localDateTimeFrom = LocalDateTime.of(2021,12, 20, 12,12,12 );
        LocalDateTime localDateTimeTo = LocalDateTime.of(2022, 1, 3, 12,12,12);

        Duration duration = Duration.between(localDateTimeFrom, localDateTimeTo);
        System.out.println(duration);
    }
}
