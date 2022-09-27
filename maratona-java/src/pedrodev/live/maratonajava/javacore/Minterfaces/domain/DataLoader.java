package pedrodev.live.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {

    /*public static final */int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission() {
        System.out.println("Checking Permission");
    }

    public static void retrieveMaxDataSize(){
        System.out.println(MAX_DATA_SIZE);
    }

}
