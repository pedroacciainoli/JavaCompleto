package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime birthDate = LocalDateTime.of(1994, Month.MARCH, 24, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(birthDate, now));
        System.out.println(ChronoUnit.WEEKS.between(birthDate, now));
        System.out.println(ChronoUnit.MONTHS.between(birthDate, now));
        System.out.println(ChronoUnit.YEARS.between(birthDate, now));
    }
}

