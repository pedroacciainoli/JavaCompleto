package pedrodev.live.maratonajava.javacore.Bintroducaometodos.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalcultatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1,2,3,4,5};
        calculator.sumArray(numbers);
        calculator.sumVarArgs(1,2,3,4,5,6);
    }
}
