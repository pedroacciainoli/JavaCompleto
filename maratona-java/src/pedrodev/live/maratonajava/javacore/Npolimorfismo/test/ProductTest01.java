package pedrodev.live.maratonajava.javacore.Npolimorfismo.test;

import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Computer;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Product;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Television;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.service.TaxCalc;

public class ProductTest01 {
    public static void main(String[] args) {
        Product computer = new Computer("I9",6000);
        Product tomato = new Tomato("Red", 12);
        Television tv = new Television("Samsung",3000);


        TaxCalc.TaxCalc(computer);
        TaxCalc.TaxCalc(tomato);
        TaxCalc.TaxCalc(tv);
    }
}
