package pedrodev.live.maratonajava.javacore.Fmodificadorestatico.test;

import pedrodev.live.maratonajava.javacore.Fmodificadorestatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Jaguar", 275);
        Car c3 = new Car("Audi", 290);

        Car.setLimitSpeed(180);

        c1.print();
        c2.print();
        c3.print();


    }
}
