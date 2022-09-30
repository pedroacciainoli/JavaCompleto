package pedrodev.live.maratonajava.javacore.Oexception.runtime.test;


public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        open();
    }

    private static void open() {
        try {
            System.out.println("Try Block");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Close file");
        }
    }
}