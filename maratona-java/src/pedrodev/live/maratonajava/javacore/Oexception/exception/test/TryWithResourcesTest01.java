package pedrodev.live.maratonajava.javacore.Oexception.exception.test;

import pedrodev.live.maratonajava.javacore.Oexception.exception.domain.Reader1;
import pedrodev.live.maratonajava.javacore.Oexception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        fileReader02();
    }

    public static void fileReader01() {
        Reader read = null;
        try {
            read = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } finally {
            try {
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void fileReader02() {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
