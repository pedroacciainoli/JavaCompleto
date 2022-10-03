package pedrodev.live.maratonajava.javacore.Qstring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(1_000_000);
        long end = System.currentTimeMillis();
        System.out.println("Execution time "+ (end -start) + "ms");

        long startBuilder = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        long endBuilder = System.currentTimeMillis();
        System.out.println("Execution time "+ (endBuilder - startBuilder) + "ms");

        long startBuffer = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        long endBuffer = System.currentTimeMillis();
        System.out.println("Execution time "+ (endBuffer - startBuffer) + "ms");
    }
    private static void concatString(int h){
        String text = "";
        for (int i = 0; i < h ; i++) {
            text += i;
        }
    }
    private static void concatStringBuilder(int h){
        StringBuilder text = new StringBuilder(h);
        for (int i = 0; i < h ; i++) {
            text.append(i);
        }
    }

    private static void concatStringBuffer(int h){
        StringBuffer text = new StringBuffer(h);
        for (int i = 0; i < h ; i++) {
            text.append(i);
        }
    }


}
