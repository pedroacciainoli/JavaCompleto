package pedrodev.live.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        newFile();
    }
    private static void newFile() throws IOException {
        File file = new File("files/test3.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
