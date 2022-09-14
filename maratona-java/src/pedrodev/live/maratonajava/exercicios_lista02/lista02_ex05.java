package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex05 {
    public static void main(String[] args) {

/*
        Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
        utilizando um automóvel que faz 12 Km por litro.
        Para obter o cálculo,
        o usuário deve fornecer o tempo gasto na viagem e a velocidade média.

        Desta forma,
        será possível obter a distância percorrida com a fórmula

        DISTANCIA = TEMPO * VELOCIDADE.

        Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada
        na viagem com a fórmula:
        LITROS_USADOS = DISTANCIA / 12.

        O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida
        e a quantidade de litros utilizada na viagem.

        Dica: trabalhe com valores reais.
*/

        Scanner read = new Scanner(System.in);

        System.out.println("Informe o tempo gasto na viagem em h");
        int time = read.nextInt();
        System.out.println("Infome a velocidade média em km/h");
        int averageSpeed = read.nextInt();

        int distance = time * averageSpeed;

        int litersUsed = distance / 12;

        System.out.println("Sua velocidade média foi de:" + averageSpeed + "km/h");
        System.out.println("Seu tempo gasto foi de:" + time + "Minutos");
        System.out.println("Sua distancia percorrida foi de:" + distance + "M");
        System.out.println("Total de litros utilizados na viagem " + litersUsed + "L");


    }
}
