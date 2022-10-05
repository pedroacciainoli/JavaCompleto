package pedrodev.live.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File file = new File("file");
        boolean isDirectoryCreated = file.mkdir();
        System.out.println(isDirectoryCreated);
        File fileDirectory = new File(file,"file2.txt");
        boolean isFileCreated = fileDirectory.createNewFile();
        System.out.println(isFileCreated);
        File fileRenamed = new File(file,"file2_renamed.txt");
        boolean isRenamed = fileDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File directoryRenamed = new File("file_renamed");
        boolean isDirectoryRenamed = file.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);
    }
}
