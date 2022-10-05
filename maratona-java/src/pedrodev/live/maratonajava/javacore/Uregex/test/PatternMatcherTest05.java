package pedrodev.live.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z0-9])+\\.([a-zA-Z]\\.?)+";
        String text = "pedro@hotmail.com, 123john@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail, pedro.acciainoli@gmail.com.br";
        System.out.println("Valid E-mail:");
        System.out.println("zoro@mail.br".matches(regex));


        System.out.println(Arrays.toString(text.split(",")));

        //transformar a string text em um array de strings
        //utilizando , como divisor de posições e sem espaço com metodo trim
        Arrays[] emails = new Arrays[5];
        for (int i = 0; i < emails.length; i++) {
            String email = text.split(",")[i].trim();
            System.out.println(email);
        }



        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:  " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("positions found");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " \n");
        }
    }
}

