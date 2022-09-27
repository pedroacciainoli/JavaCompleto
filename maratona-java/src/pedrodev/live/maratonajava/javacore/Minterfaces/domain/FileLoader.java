package pedrodev.live.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading File Data");
    }

    @Override
    public void remove() {
        System.out.println("Removing File Data");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission on FileLoader");

    }
}
