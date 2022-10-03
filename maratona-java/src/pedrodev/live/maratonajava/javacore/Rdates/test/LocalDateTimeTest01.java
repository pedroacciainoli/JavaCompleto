package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-03-21");
        LocalTime time = LocalTime.parse("10:00:45");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime2);
    }
}
