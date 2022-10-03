package pedrodev.live.maratonajava.javacore.Sformat.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("PT","BR");
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double value = 10_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String valueString = "1_000.2130";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
