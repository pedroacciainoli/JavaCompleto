package pedrodev.live.maratonajava.javacore.Jmodificadorfinal.test;

import pedrodev.live.maratonajava.javacore.Jmodificadorfinal.domain.Car;
import pedrodev.live.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();


        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);

        car.BUYER.setName("Junin");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("MM");
        ferrari.print();



    }
}
