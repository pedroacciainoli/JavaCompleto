package pedrodev.live.maratonajava.javacore.Npolimorfismo.service;

import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Computer;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Product;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalc {


/*    public static void ComputerTaxCalc(Computer computer){
        System.out.println("PRINTING COMPUTER TAX");
        double tax = computer.taxCalc();
        System.out.println("COMPUTER: " + computer.getName());
        System.out.println("VALUE: " +computer.getValue());
        System.out.println("TAX: " + tax);
    }

    public static void TomatoTaxCalc(Tomato tomato){
        System.out.println("PRINTING TOMATO TAX");
        double tax = tomato.taxCalc();
        System.out.println("COMPUTER: " + tomato.getName());
        System.out.println("VALUE: " +tomato.getValue());
        System.out.println("TAX: " + tax);
    }*/

    public static void TaxCalc(Product product) {
        System.out.println("PRINTING TAX");
        double tax = product.taxCalc();
        System.out.println("Product: " + product.getName());
        System.out.println("VALUE: " + product.getValue());
        System.out.println("TAX: " + tax);
        if (product instanceof Tomato) {
         /*   Tomato tomato = (Tomato) product;
            ((Tomato) product).getValidData();*/
            String validData = ((Tomato) product).getValidData();

            System.out.println(validData);
        }
    }
}
