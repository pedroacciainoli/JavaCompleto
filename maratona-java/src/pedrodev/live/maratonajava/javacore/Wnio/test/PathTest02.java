package pedrodev.live.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file_nio");
        if (Files.notExists(path)) {
            Path pathDirectory = Files.createDirectory(path);
        }
        Path subPath = Paths.get("file_nio/subpath/subpath");
        System.out.println(subPath);

        Path of = Path.of(subPath.toString());
        System.out.println(of);
        Path subPathDirectory = Files.createDirectories(subPath);
        Path subPathDirectory2 = Files.createDirectories(of);

        Path ofFile = Path.of(subPath.toString(), "file.txt");
        if (!Files.exists(ofFile)) {
            Path file = Files.createFile(ofFile);
        }

        Path source = ofFile;
        Path target = Paths.get(of.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }

}
