package pedrodev.live.maratonajava.javacore.Jmodificadorfinal.domain;

public class Car {
    private String name;
    public static final double LIMIT_SPEED;
    public final Buyer BUYER = new Buyer();

    static {
        LIMIT_SPEED = 250;
    }

    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
