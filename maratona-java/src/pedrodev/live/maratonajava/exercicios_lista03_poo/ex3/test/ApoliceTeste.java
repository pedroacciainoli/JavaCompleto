package pedrodev.live.maratonajava.exercicios_lista03_poo.ex3.test;

import pedrodev.live.maratonajava.exercicios_lista03_poo.ex3.domain.Apolice;

import java.util.Scanner;

public class ApoliceTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade ");
        int idade = input.nextInt();

        System.out.println("Digite o valor do prêmio");
        double premio = input.nextDouble();

        System.out.println("Digite sua cidade");
        String cidade = input.nextLine();

        Apolice apolice = new Apolice(nome,idade,premio);
        apolice.calcularPremioApolice();
        apolice.oferecerDesconto(cidade);
        apolice.imprimir();


    }
}
