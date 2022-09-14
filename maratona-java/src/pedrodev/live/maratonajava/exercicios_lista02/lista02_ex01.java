package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex01 {
    public static void main(String[] args) {

    /*    Faça um programa para calcular o estoque médio de
        uma peça, sendo que: ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.*/

        Scanner read = new Scanner(System.in);

        System.out.printf("Digite o código da peça \n");
        int partCode = read.nextInt();
        System.out.printf("Digite a quantidade máxima de peças\n");
        int qtdMax = read.nextInt();
        System.out.printf("Digite a quantidade minima de peças \n");
        int qtdMin = read.nextInt();

        int qtdMed = (qtdMin + qtdMax) / 2 ;

        System.out.println("Seu estoque médio é de: " + qtdMed);




    }
}
