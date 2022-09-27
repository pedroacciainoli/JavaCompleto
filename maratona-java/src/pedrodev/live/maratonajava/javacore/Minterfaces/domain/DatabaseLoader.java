package pedrodev.live.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.printf("Loading Data");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission on DatabaseLoader");
    }


}
