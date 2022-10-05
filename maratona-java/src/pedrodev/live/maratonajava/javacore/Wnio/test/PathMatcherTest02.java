package pedrodev.live.maratonajava.javacore.Wnio.test;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListaJavaClassFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
         if(file.getFileName().toString().endsWith(".class")) {
            System.out.println("CLASS");
            System.out.println(file.getFileName());
        }
        //System.out.println("File:" + file.getFileName());
        return FileVisitResult.CONTINUE;
    }
}


class FindAllJavaOrClasses extends SimpleFileVisitor<Path>{
    private final PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(matcher.matches(file)) {
            System.out.println("JAVA OR CLASS");
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
       // Files.walkFileTree(root,new ListaJavaClassFiles());
        Files.walkFileTree(root,new FindAllJavaOrClasses());

    }
}

