package pedrodev.live.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String projectPath = "Home/pedro/dev";
        String fileTxt = "../../file.txt";
        Path path = Paths.get(projectPath, fileTxt);
        Path path2 = Paths.get("Home/./pedro/./dev", fileTxt);
        System.out.println(path);
        System.out.println(path2);
        System.out.println(path.normalize());
        System.out.println(path2.normalize());

    }
}
