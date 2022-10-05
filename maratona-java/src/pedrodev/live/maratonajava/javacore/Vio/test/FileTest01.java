package pedrodev.live.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean isDeleted = file.delete();
            boolean isCreated = file.createNewFile();
            boolean exists = file.exists();
            if (exists) {
                System.out.println("File Exist");
                System.out.println(isCreated);
                System.out.println("Path absolute: " + file.getAbsolutePath());
                System.out.println("Is directory: " + file.isDirectory());
                System.out.println("Is hidden: " + file.isDirectory());
                System.out.println("Is file: " + file.isFile());
                System.out.println("last modified: " + new Date(file.lastModified()));
            } else {
                System.out.println("File does not exist");
                System.out.println(isDeleted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
