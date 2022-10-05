package pedrodev.live.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {

   /*         System.out.println(fr.read());  BUFFER
            char[] in = new char[500];
            fr.read(in);
            for (char c : in) {
                System.out.println(c);
            }*/

            int i;
            while ((i = fr.read()) != -1) { // -1 é o fim do arquivo
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
