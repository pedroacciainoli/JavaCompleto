package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());




    }
}
