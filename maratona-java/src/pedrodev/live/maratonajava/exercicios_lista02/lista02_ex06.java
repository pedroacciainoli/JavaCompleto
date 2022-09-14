package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex06 {
    public static void main(String[] args) {
       /* Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit.
        A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5,
        em que a variável F representa é a temperatura em graus Fahrenheit e a
        variável C representa é a temperatura em graus Celsius.*/

        Scanner read  = new Scanner(System.in);

        System.out.println("Digite sua temperatura em Celsius");
        double tempC = read.nextDouble();

        double tempF = ((9 * tempC) + 160) / 5;

        System.out.println("Sua temperatura em Fahenheit é:" + tempF);


    }
}
