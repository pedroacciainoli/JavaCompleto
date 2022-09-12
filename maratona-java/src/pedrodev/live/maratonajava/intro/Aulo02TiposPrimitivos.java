package pedrodev.live.maratonajava.intro;

public class Aulo02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float char, byte, short, long & boolean
        int age = 10;
        //cast
        int agecast = (int) 1000000000L;
        long bigNumber = 10000L;
        double doubleSalary = 2000.0D;
        float floatSalary = 2500.0F;
        byte byteAge = 127;
        short shortAge = 10;
        boolean tr = true;
        boolean fal = false;
        char character = 99;

        String name = "dont go gentle in that good night";

        //java 11 implements var type
        var name1 = "Luciano";

        System.out.println("Idade é: " +age);
        System.out.println("Idade big  é: " +bigNumber);
        System.out.println("char é: " +character);
        System.out.println("Frase: " +name);


    }
}
