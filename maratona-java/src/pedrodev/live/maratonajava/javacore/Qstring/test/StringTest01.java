package pedrodev.live.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        //STRINGS SÃO IMUTAVEIS

        String name = "Peter";
        String name2 = "Peter";
        name = " Duo".concat(name);
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name == name2);
        String name3 = new String("Peter");
        System.out.println(name2 == name3.intern());

    }
}
