package pedrodev.live.maratonajava.javacore.Bintroducaometodos.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 12;
        int num2 = 2;
        calculator.changeNumbers(num1, num2);
        System.out.println();
    }
}
