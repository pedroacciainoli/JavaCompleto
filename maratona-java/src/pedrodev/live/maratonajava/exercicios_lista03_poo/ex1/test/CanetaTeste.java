package pedrodev.live.maratonajava.exercicios_lista03_poo.ex1.test;

import pedrodev.live.maratonajava.exercicios_lista03_poo.ex1.domain.Caneta;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Bic","Azul",1.53);
        System.out.println(caneta.getMarca() + caneta.getCor() + caneta.getTamanho());

    }
}
