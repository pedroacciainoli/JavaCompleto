package pedrodev.live.maratonajava.exercicios;

public class lista01_ex04 {
    /*Escrever um algoritmo que lê:

            - a porcentagem do IPI a ser acrescido no valor das peças
            - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
            - o código da peça 2, valor unitário da peça 2, quantidade de peças 2

    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.

    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

    */

    public static void main(String[] args) {
        float ipi = 6;
        int cod01 = 2030;
        float valuecod01 = 3060F;
        int qtdcod01 = 32;
        int cod02 = 2040;
        float valuecod02 = 3695F;
        int qtdcod02 = 62;

        float payTotalValue = ((valuecod01 * qtdcod01) + (valuecod02 * qtdcod02) * (ipi / 100) + 1 );

        System.out.println("Total a ser pago pelas peças é: " + payTotalValue);

    }

}
