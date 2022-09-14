package pedrodev.live.maratonajava.exercicios;

import java.util.Scanner;

public class lista01_ex06 {
    public static void main(String[] args) {


/*        Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        antecessor e seu sucessor
        */

        Scanner read = new Scanner(System.in);

        System.out.printf("Informe um numero:\n");
        int number = read.nextInt();

        int after = number + 1;
        int before = number - 1;

        System.out.println("Número após é " + after );
        System.out.println("Número anterior é " + before);


    }
}
