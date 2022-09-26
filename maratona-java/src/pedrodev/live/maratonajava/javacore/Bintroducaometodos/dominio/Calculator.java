package pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculator {

    public void Sum() {
        System.out.println(10 + 10);
    }

    public void Minus() {
        System.out.println(20 - 10);
    }

    public void OneNumberTimesAnother(int varA, int varB) {
        System.out.println(varA * varB);
    }

    public double OneNumberDividedByAnother(double varA, double varB) {
        if (varB == 0) {
            return 0;
        }
        return varA / varB;
    }

    public void OneNumberDividedByAnotherPrint(double varA, double varB) {
        if (varB == 0) {
            System.out.println("Error");
            return;
        }
        System.out.println(varA / varB);
    }

    public void changeNumbers(int varA, int varB) {
        System.out.println("Start");
        System.out.println("Num 1 " + varA);
        System.out.println("Num 2 " + varB);
    }


    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
          sum += numbers[i];
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}

