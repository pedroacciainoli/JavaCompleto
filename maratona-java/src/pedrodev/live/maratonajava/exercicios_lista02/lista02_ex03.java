package pedrodev.live.maratonajava.exercicios_lista02;

import java.util.Scanner;

public class lista02_ex03 {
    public static void main(String[] args) {

/*        Faça um programa para pagamento de comissão de vendedores de peças, levando-se em
        consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados:

        - Identificação do vendedor
        - Código da peça
        - Preço unitário da peça - Quantidade vendida*/

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor");
        String name = read.next();

        System.out.println("Digite o código da peça");
        int partCode = read.nextInt();

        System.out.println("Digite o Preço da Peça");
        float partValue = read.nextFloat();

        System.out.println("Digite o total vendido");
        float qtdSell = read.nextFloat();

        float commission = 5/100F;

        float totalSell = partValue * qtdSell;
        float totalSellCommission = totalSell * commission ;

        System.out.println("O valor total de sua comissão é de " + totalSellCommission );

    }
}
