package pedrodev.live.maratonajava.exercicios_lista03_poo.ex2.test;

import pedrodev.live.maratonajava.exercicios_lista03_poo.ex2.domain.Lampada;
import pedrodev.live.maratonajava.exercicios_lista03_poo.ex2.domain.TipoLampada;

public class LampadaTeste {
    public static void main(String[] args) {
        Lampada lamp01 = new Lampada(TipoLampada.FLUORESCENTE, 220, "5000k",
                "osram", 13.50F, "30w", false);
        Lampada lamp02 = new Lampada(TipoLampada.LED, 110, "3000k",
                "philips", 10.20F, "10w", true);

        System.out.println("---------------------");
        System.out.println("---------LAMP 01 STATUS ----------");
        lamp01.checaStatus();
        System.out.println(lamp01);

        System.out.println("---------------------");
        System.out.println("---------LAMP 02 STATUS ----------");
        lamp02.checaStatus();
        System.out.println(lamp02);

        if (lamp01.getValor() > lamp02.getValor()) {
            System.out.println("Lâmpada 01 mais cara que a lâmpada 02");
        } else {
            System.out.println("Lâmpada 02 mais cara que a lâmpada 01");
        }


    }
}
