package pedrodev.live.maratonajava.javacore.Npolimorfismo.domain;

public class Television extends Product{
    public static final double TAX = 0.16;

    public Television(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalc() {
        return this.value * TAX;
    }
}
