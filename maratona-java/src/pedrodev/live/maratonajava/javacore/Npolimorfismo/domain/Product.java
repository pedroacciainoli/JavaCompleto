package pedrodev.live.maratonajava.javacore.Npolimorfismo.domain;

public abstract class Product implements Tax {
    protected String name;
    protected double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
