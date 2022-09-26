package pedrodev.live.maratonajava.javacore.Bintroducaometodos.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.Sum();
        System.out.println("Finalizando Calculator Sum");
        calculator.Minus();
    }
}
