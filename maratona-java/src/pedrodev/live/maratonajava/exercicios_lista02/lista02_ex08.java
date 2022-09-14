package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex08 {
    public static void main(String[] args) {
        /*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: V= 3.14159*R*R*A
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.*/

        Scanner read = new Scanner(System.in);
        float volume, radius, height;


        System.out.println("Digite o raio");
        radius = read.nextFloat();
        System.out.println("Digite a altura");
        height = read.nextFloat();

        volume = 3.14159F * radius * radius * height;

        System.out.println("O valor do volume é: " + volume);

    }
}
