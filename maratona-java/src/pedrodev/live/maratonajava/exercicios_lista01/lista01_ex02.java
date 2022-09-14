package pedrodev.live.maratonajava.exercicios_lista01;

public class lista01_ex02 {

    //                2. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
    //                   números 4, 5 e 6. A soma das duas médias. A média das médias.

    public static void main(String[] args) {
        int numbers1[] = new int[]{8, 9, 7};
        int numbers2[] = new int[]{4, 5, 6};


        int sumOfN1 = numbers1[0] + numbers1[1] + numbers1[2];
        System.out.println("Média dos números 8 9 7 = " + sumOfN1 / numbers1.length);
        int sumOfN2 = numbers2[0] + numbers2[1] + numbers2[2];
        System.out.println("Média dos números 4 5 6 = " + sumOfN2 / numbers2.length);
        int sumOfAll = (sumOfN1 / numbers1.length + sumOfN2 / numbers2.length);
        int averageOfAverage = ((sumOfN1 / numbers1.length + sumOfN2 / numbers2.length) / 2);

        System.out.println(sumOfAll);
        System.out.println(averageOfAverage);


    }
}
