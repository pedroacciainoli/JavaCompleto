package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timePlus8Hours = LocalTime.now().plusHours(8);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timePlus8Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(6000));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.toDays());

        System.out.println(Duration.ofDays(20));
        System.out.println(Duration.ofMinutes(3));
        System.out.println(Duration.of(3, ChronoUnit.HOURS));

    }
}
