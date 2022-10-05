package pedrodev.live.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true); // if append not true it will overwrite the file
             BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write("Olá Mundo");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

