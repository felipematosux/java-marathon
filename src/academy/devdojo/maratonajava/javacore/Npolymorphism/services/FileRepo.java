package academy.devdojo.maratonajava.javacore.Npolymorphism.services;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repo.Repo;

public class FileRepo implements Repo {
    @Override
    public void save() {
        System.out.println("Saving a file!");
    }
}
