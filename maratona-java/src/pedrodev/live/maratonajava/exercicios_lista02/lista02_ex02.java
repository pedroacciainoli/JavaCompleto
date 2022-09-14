package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex02 {
    public static void main(String[] args) {


   /*     Faça um programa que:
        - Leia a cotação do dólar
        - Leia um valor em dólares
        - Converta esse valor para Real - Mostre o resultado

                */


        Scanner read = new Scanner(System.in);

        System.out.println("Digite a cotação do dollar hoje");
        float dollarToday = read.nextFloat();
        System.out.println("Digite o valor em dollar");
        float dollar = read.nextFloat();

        float realConvert = dollar * dollarToday;

        System.out.println("O valor em reais é de: " + realConvert);

    }
}
