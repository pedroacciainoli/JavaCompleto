package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_0L); //long 100000

        System.out.println(date);
    }
}
