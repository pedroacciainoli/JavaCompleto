package pedrodev.live.maratonajava.javacore.Npolimorfismo.service;

import pedrodev.live.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryFile implements Repository {
    @Override
    public void save() {
        System.out.println("Saving File");
    }
}

