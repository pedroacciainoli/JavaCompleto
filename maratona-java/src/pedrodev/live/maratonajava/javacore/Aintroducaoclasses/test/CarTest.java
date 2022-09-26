package pedrodev.live.maratonajava.javacore.Aintroducaoclasses.test;

import pedrodev.live.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();



        car.name = "Focus";
        car.model = "SUV";
        car.year = 2009;


        car2.name = "Lancer";
        car2.model = "GT";
        car2.year = 2014;


        car = car2 ;
        System.out.println("Nome: " + car.name + " Modelo: " + car.model + " Ano: " + car.year + "\n");
        System.out.println("Nome: " + car2.name + " Modelo: " + car2.model + " Ano: " + car2.year);

    }
}
