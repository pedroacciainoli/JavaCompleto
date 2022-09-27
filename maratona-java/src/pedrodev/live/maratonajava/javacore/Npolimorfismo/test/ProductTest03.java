package pedrodev.live.maratonajava.javacore.Npolimorfismo.test;

import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Computer;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Product;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.service.TaxCalc;

public class ProductTest03 {
    public static void main(String[] args) {

        Product product = new Computer("I7",1000);

        Tomato tomato = new Tomato("Red", 12);
        tomato.setValidData("23/10/2022");

        TaxCalc.TaxCalc(tomato);
        TaxCalc.TaxCalc(product);


      /*  Product product = new Computer("Name",300);  // Polymorphism
        Computer computer = (Computer)product;
        System.out.println(computer.taxCalc());
*/
    }




}
