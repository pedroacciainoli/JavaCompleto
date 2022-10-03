package pedrodev.live.maratonajava.javacore.Sformat.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mask = " 'Brazil' dd.MM.yyyy 'hora' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(mask);
        System.out.println(sdf.format(new Date()));
    }
}
