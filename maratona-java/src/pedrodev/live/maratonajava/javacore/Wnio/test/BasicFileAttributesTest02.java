package pedrodev.live.maratonajava.javacore.Wnio.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file/newfile.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        FileTime fileTime = posixFileAttributes.creationTime();
        FileTime fileTime1 = posixFileAttributes.lastAccessTime();
        FileTime fileTime2 = posixFileAttributes.lastModifiedTime();

        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);

        System.out.println("----------");

        PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        FileTime fileTime3 = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(fileTime,fileTime3, fileTime2);

        fileTime = fileAttributeView.readAttributes().creationTime();
        fileTime1 = fileAttributeView.readAttributes().lastAccessTime();
        fileTime2 = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println(fileTime);
        System.out.println(fileTime1);
        System.out.println(fileTime2);

    }
}

