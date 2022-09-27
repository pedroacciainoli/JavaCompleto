package pedrodev.live.maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product{
    public static final double TAX = 0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalc() {
        System.out.println("Calculating Computer Tax");
        return this.value * TAX;
    }


}
