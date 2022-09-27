package pedrodev.live.maratonajava.javacore.Npolimorfismo.service;

import pedrodev.live.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class RepositoryDataBase implements Repository{
    @Override
    public void save() {
        System.out.println("Saving DataBase");
    }
}
