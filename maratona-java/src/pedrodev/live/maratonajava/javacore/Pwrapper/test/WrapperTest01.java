package pedrodev.live.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortp = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;


        //regras de polimorfismo
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW;
        Integer intW2 = Integer.parseInt("1");
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
    }
}
