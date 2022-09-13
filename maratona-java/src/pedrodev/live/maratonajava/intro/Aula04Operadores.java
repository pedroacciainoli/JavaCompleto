package pedrodev.live.maratonajava.intro;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        System.out.println(number02+number01);
        System.out.println(number02/number01);

        // % modulo

        int modulus = 20 % 2;
        System.out.println(modulus);

        // < > <= >= == !=
        boolean isTenBiggerThan20 = 10 > 20;
        boolean isTenLessThan20 = 10 < 20;
        boolean isTenEqualThan20 = 10 == 20;

        System.out.println("isTenBiggerThan20 "+isTenBiggerThan20);
        System.out.println("isTenLesserThan20 "+isTenLessThan20);
        System.out.println("isTenEqualThan20 "+isTenEqualThan20);


        //logical operators
        // && and  -- || or  !

        int age = 29;
        float salary = 3500F;
        boolean isInTheLayBiggerThan30 = age > 30 && salary >= 4612;
        boolean isInTheLayLesserThan30 = age < 30 && salary >= 3381;
        System.out.println("isInTheLayBiggerThan30 "+isInTheLayBiggerThan30);
        System.out.println("isInTheLayLesserThan30 "+isInTheLayLesserThan30);


        double totalAmountCurrent = 200;
        double totalAmountSavings = 10000;
        float playstationValue = 5000F;

        boolean isCanBuyPlaystationFive = totalAmountCurrent > playstationValue || totalAmountSavings > playstationValue;
        System.out.println("isCanBuyPlaystationFive " +isCanBuyPlaystationFive);


        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ -- increment decrement
        int count = 0;
        count += 1;
        count++;
        count--;
        int count2 = 0;
        ++count2;
        count2++;
        System.out.println(count2);



    }


}
