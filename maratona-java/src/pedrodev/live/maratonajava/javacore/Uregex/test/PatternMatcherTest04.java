package pedrodev.live.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo que não for digito
        // \s = Espaço em branco \t \n \f \r
        // \S = Tudo que não for espaço em branco
        // \w = a-z A-Z, dígitos, _(underline)
        // \W = Tudo que não for incluso no \w
        // [] = range
        // ? = zero ou uma
        // * = zero ou mais
        // + = uma ou mais
        // {n,m} = de n até m
        // () = agrupamento
        // | = ou
        // $ = fim da linha


        String regex = "0[xX]([0-9a-f-A-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:  " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("positions found");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " \n");
        }
        int numberHex = 0x59F86A;
        System.out.println(numberHex);

    }
}

