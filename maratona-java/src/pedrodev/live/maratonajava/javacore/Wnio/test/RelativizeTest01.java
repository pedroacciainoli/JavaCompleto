package pedrodev.live.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("/Home/pedro");
        Path path2 = Paths.get("/Home/pedro/devdev/hello-world.txt");
        Path relat = path.relativize(path2);
        System.out.println(relat);

        Path absolute1 = Paths.get("/Home/pedro");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/Home/pedro/devdev/hello-world.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.20221004");


        System.out.println("1 " +absolute1.relativize(absolute3));
        System.out.println("2 " +absolute3.relativize(absolute1));
        System.out.println("3 " +absolute1.relativize(absolute2));
        System.out.println("4 " +relative1.relativize(relative2));
//        System.out.println("5 " +absolute1.relativize(relative1)); relative to absolute return exception



    }
}
