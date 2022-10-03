package pedrodev.live.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "   Roger ";
        String numbers = "12345";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("R","D"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(2,4));
        System.out.println(name.trim());



    }
}
