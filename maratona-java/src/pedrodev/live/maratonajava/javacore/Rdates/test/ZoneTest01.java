package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId of = ZoneId.of("Asia/Tokyo");
        System.out.println(of);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(of);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(of);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset of1 = ZoneOffset.of("-04:00");
        System.out.println(now.atOffset(of1));

        Instant instant = Instant.now();
        OffsetDateTime offsetDateTime = instant.atOffset(of1);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate whatsEra = LocalDate.of(1900,2,1);
        JapaneseDate from = JapaneseDate.from(whatsEra);
        System.out.println(from);


    }
}
