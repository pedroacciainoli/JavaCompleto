package pedrodev.live.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("Home/pedro");
        Path file = Paths.get("dev/file.txt");
        Path resolve = dir.resolve(file);
        System.out.println(resolve);


        Path absolute = Paths.get("/Home/pedro");
        Path relative = Paths.get("dev");
        Path file2 = Paths.get("file.txt");

        System.out.println("1 " + absolute.resolve(relative));
        System.out.println("2 " + absolute.resolve(file2));
        //only resolves relative to absolute
        System.out.println("3 " + relative.resolve(absolute));
        System.out.println("4 " + relative.resolve(file2));
        System.out.println("5 " + file2.resolve(absolute));
        System.out.println("6 " + file2.resolve(relative));


    }
}
