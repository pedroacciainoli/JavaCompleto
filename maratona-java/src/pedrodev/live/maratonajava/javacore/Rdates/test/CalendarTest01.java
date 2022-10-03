package pedrodev.live.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Sunday is the first day of week");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2);
        c.roll(Calendar.DAY_OF_MONTH, 2);
        Date date = c.getTime();
        System.out.println(date);
    }
}
