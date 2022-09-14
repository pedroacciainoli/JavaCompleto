package pedrodev.live.maratonajava.exercicios;
import java.util.Scanner;

public class lista01_ex01 {
    public static void main(String[] args) {
        // 1 -
        Scanner daysMonthYear = new Scanner(System.in);
        System.out.printf("Informe a idade em anos, meses e dias:\n");

        System.out.printf("Informe a idade em dias:\n");
        int day = daysMonthYear.nextInt();
        System.out.printf("Informe a idade em meses:\n");
        int month = daysMonthYear.nextInt();
        System.out.printf("Informe a idade em anos:\n");
        int year = daysMonthYear.nextInt();

        System.out.println("Total de dias =  " + (day + (month*30) + (year*365)) );


    }
}

