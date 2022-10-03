package pedrodev.live.maratonajava.javacore.Sformat.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("PT","BR");
        Locale localeIT = Locale.ITALY;
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double value = 100_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(value));
        }

        String valueString = "$1000.2130";
        try {
            System.out.println(nfa[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
