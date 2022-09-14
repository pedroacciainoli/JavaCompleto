package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex09 {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva
        a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */

        Scanner daysMonthYear = new Scanner(System.in);
        System.out.printf("Informe a idade em anos, meses e dias:\n");

        System.out.printf("Informe a idade em dias:\n");
        int day = daysMonthYear.nextInt();
        System.out.printf("Informe a idade em meses:\n");
        int month = daysMonthYear.nextInt();
        System.out.printf("Informe a idade em anos:\n");
        int year = daysMonthYear.nextInt();

        System.out.println("Total de dias =  " + (day + (month * 30) + (year * 365)));


    }
}
