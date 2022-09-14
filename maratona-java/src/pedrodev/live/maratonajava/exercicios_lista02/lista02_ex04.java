package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex04 {
    public static void main(String[] args) {

   /*     Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois
        da adição e multiplicação entre os valores lidos, baseando-se na utilização
        do conceito de propriedade distributiva.

        Dica: se forem lidas as variáveis A, B, C e D,
        devem ser somados e multiplicados os valores de A com B, A com C e A com D;
        depois B com C, B com D e por último C com D.

        Note que para cada operação serão utilizadas seis combinações. Assim sendo,
        devem ser realizadas doze operações de processamento,
        sendo seis para as adições e seis para as multiplicações.*/

        Scanner read = new Scanner(System.in);
        int values[] = new int[4];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Digite o valor do valor " + i);
            values[i] = read.nextInt();
        }


        System.out.println("---------------------------------\n");
        System.out.println("ADICÕES");

        System.out.println("Soma do valor 1 e 2 =  " + (values[0] + values[1]) + "\n");
        System.out.println("Soma do valor 1 e 3 =  " + (values[0] + values[2]) + "\n");
        System.out.println("Soma do valor 1 e 4 =  " + (values[0] + values[3]) + "\n");
        System.out.println("Soma do valor 2 e 3 =  " + (values[1] + values[2]) + "\n");
        System.out.println("Soma do valor 2 e 4 =  " + (values[1] + values[3]) + "\n");
        System.out.println("Soma do valor 3 e 4 =  " + (values[2] + values[3]) + "\n\n");

        System.out.println("---------------------------------\n");
        System.out.println("MULTIPLICAÇÕES \n");

        System.out.println("Multiplicação do valor 1 e 2 =  " + (values[0] * values[1]) + "\n");
        System.out.println("Multiplicação do valor 1 e 3 =  " + (values[0] * values[2]) + "\n");
        System.out.println("Multiplicação do valor 1 e 4 =  " + (values[0] * values[3]) + "\n");
        System.out.println("Multiplicação do valor 2 e 3 =  " + (values[1] * values[2]) + "\n");
        System.out.println("Multiplicação do valor 2 e 4 =  " + (values[1] * values[3]) + "\n");
        System.out.println("Multiplicação do valor 3 e 4 =  " + (values[2] * values[3]) + "\n");


    }


}
