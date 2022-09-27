package pedrodev.live.maratonajava.javacore.Npolimorfismo.test;

import pedrodev.live.maratonajava.javacore.Npolimorfismo.repository.Repository;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.service.RepositoryDataBase;
import pedrodev.live.maratonajava.javacore.Npolimorfismo.service.RepositoryMemory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository database = new RepositoryDataBase();
        Repository memory = new RepositoryMemory();

        List<String> list = new LinkedList<>();

        list.add("Duda");
        list.add("Fabin");

        System.out.println(list);

        memory.save();
        database.save();
    }
}
