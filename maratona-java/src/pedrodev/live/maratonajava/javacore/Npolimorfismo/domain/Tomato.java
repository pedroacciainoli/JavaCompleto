package pedrodev.live.maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product {
    public static final double TAX = 0.16;
    private String validData;
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalc() {
        System.out.println("Calculating Tomato Tax");
        return this.value * TAX;
    }

    public String getValidData() {
        return validData;
    }

    public void setValidData(String validData) {
        this.validData = validData;
    }
}
