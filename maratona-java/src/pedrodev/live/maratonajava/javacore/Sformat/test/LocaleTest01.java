package pedrodev.live.maratonajava.javacore.Sformat.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeIndian = new Locale("hi","IN");
        Locale localeJapan = new Locale("ja","JP");

        //STATIC VARIABLES
        Locale localeJapan2 = Locale.JAPAN;
        Locale localjp = Locale.JAPANESE;

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndian);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapan);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
    }
}
