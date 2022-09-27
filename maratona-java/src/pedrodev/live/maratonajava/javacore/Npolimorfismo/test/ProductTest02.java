package pedrodev.live.maratonajava.javacore.Npolimorfismo.test;

import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Computer;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Product;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Television;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.service.TaxCalc;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 5", 1500);
        Product product1 = new Tomato("Red", 10);

        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.taxCalc());


        System.out.println(product1.getName());
        System.out.println(product1.getValue());
        System.out.println(product1.taxCalc());

       // product1.getValidData(); getValidData is from Tomato Class

        Tomato tomato = new Tomato("Du",20);
        tomato.setValidData("23/03/1994");
        System.out.println(tomato.getValidData());



    }


}
