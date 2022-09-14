package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex10 {
    public static void main(String[] args) {
        /*
        Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos
        de ordem existentes entre eles.

        Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.*/

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int valueA = read.nextInt();
        System.out.println("Digite o valor de B");
        int valueB = read.nextInt();

        System.out.println("Os dois valores são iguais?\n"+ (valueA == valueB));
        System.out.println("Os dois valores não são iguais?\n"+ (valueA != valueB ));
        System.out.println("O valor de A é maior que o valor de B?\n" + (valueA > valueB));
        System.out.println("O valor de A é menor que o valor de b?\n" + (valueA < valueB));
        System.out.println("O valor de A é maior ou igual o valor de b?\n" + (valueA >= valueB));
        System.out.println("O valor de A é menor ou igual o valor de b?\n" + (valueA <= valueB));
    }


}
