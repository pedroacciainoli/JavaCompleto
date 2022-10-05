package pedrodev.live.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        final PathMatcher glob = FileSystems.getDefault().getPathMatcher("glob:**/*.{bkp,java,txt}");
        final PathMatcher regex = FileSystems.getDefault().getPathMatcher("regex:.*\\.(bkp|java|txt)");

        System.out.println(glob.matches(Paths.get("file.txt")));
        System.out.println(regex.matches(Paths.get("file.txt")));

        System.out.println("*-------------------------*");
        Path path1 = Paths.get("file/sub-folder/sub-folder1/sub-text1.bkp");
        Path path2 = Paths.get("file/sub-folder/sub-folder1/sub-text1.txt");
        Path path3 = Paths.get("file/sub-folder/sub-folder1/sub-text1.java");
        matches(path1,"glob:**.bkp");
        matches(path1,"glob:*.bkp");
        matches(path1,"glob:**/*.{bkp,java,txt}");
        matches(path2,"glob:**/*.{bkp,java,txt}");
        matches(path3,"glob:**/*.{bkp,java,txt}");


    }
    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:" + glob);
        System.out.println(glob+ ": " + matcher.matches(path));
    }
}
