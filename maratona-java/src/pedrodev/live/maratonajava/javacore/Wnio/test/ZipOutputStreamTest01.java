package pedrodev.live.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path fileZip = Paths.get("file/file.zip");
        Path localFileZip = Paths.get("file/sub-folder/sub-folder1");
        zip(fileZip,localFileZip);
    }
    private static void zip(Path fileZip, Path localFileZip) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(fileZip));
            DirectoryStream<Path> stream = Files.newDirectoryStream(localFileZip)) {
            for (Path file : stream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                //zipStream.write(Files.readAllBytes(file)); // read all bytes from file and write in zip
                Files.copy(file,zipStream);
                zipStream.closeEntry();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
