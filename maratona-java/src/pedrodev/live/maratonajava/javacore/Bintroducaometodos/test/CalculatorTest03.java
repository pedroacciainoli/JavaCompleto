package pedrodev.live.maratonajava.javacore.Bintroducaometodos.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.OneNumberDividedByAnother(13, 2);
        System.out.println(result);

        calculator.OneNumberDividedByAnotherPrint(86,0);
    }
}
