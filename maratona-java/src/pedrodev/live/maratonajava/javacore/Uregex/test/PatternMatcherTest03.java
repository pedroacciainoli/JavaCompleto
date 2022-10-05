package pedrodev.live.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaço em branco \t \n \f \r
        // \S = Tudo que não for espaço em branco
        // \w = a-z A-Z, dígitos, _(underline)
        // \W = Tudo que não for incluso no \w
        // [] = range


        String regex = "0[xX][0-9a-f-A-F]";
        String text = "abaaba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text:  " + text2);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("positions found");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+matcher.group()+" \n");
        }
        int numberHex = 0x59F86A;
        System.out.println(numberHex);

    }
}

