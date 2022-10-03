package pedrodev.live.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Peter Jackson";
        name.concat(" Jack");
        System.out.println(name);

        StringBuilder sb = new StringBuilder("Nome");
        sb.append("+ nome");
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
