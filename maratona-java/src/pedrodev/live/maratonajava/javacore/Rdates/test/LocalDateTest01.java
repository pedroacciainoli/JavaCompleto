package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2022,10, 2);
        LocalDate dateNow = LocalDate.now();


        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date); //SQL


        System.out.println(dateNow);

    }
}
