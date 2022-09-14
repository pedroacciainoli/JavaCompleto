package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex07 {
    public static void main(String[] args) {

/*        Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. A fórmula de conversão de
        temperatura a ser utilizada é C = (F - 32) * 5 / 9, em que a variável F é a temperatura em graus Fahrenheit e a
        variável C é a temperatura em graus Celsius.*/

        Scanner read  = new Scanner(System.in);

        System.out.println("Digite sua temperatura em Fahenheit ");
        float tempF = read.nextFloat();

        float tempC = ((tempF - 32) * (5 / 9F));

        System.out.println("Sua temperatura em Celsius é:" + tempC);

    }
}
