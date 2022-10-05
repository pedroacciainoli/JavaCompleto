package pedrodev.live.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.AccessMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Set;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes
        //DosFileAttributes
        //PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(3);
        File file = new File("file/file.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("file/newfile.txt");
//        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        Files.setPosixFilePermissions(path,Set.of(PosixFilePermission.OWNER_EXECUTE,PosixFilePermission.OWNER_READ,PosixFilePermission.OWNER_WRITE));

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));


        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        Set<PosixFilePermission> permissions = posixFileAttributes.permissions();
        for (PosixFilePermission permission : permissions) {
            System.out.println(permission);
        }

        // macos hackintosh retornando false para acessmod execute, já alterei tudo e não funciona :D
        try {
            path.getFileSystem().provider().checkAccess(path, AccessMode.EXECUTE);
            System.out.println("can execute "+path);
        } catch(IOException ex) {
            ex.printStackTrace();
            System.out.println("can not execute: "+ex);
        }

    }
}
