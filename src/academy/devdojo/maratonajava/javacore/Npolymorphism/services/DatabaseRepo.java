package academy.devdojo.maratonajava.javacore.Npolymorphism.services;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repo.Repo;

public class DatabaseRepo implements Repo {
    @Override
    public void save() {
        System.out.println("Saving in the Database!");
    }
}
