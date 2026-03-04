package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repo.Repo;
import academy.devdojo.maratonajava.javacore.Npolymorphism.services.DatabaseRepo;
import academy.devdojo.maratonajava.javacore.Npolymorphism.services.FileRepo;

public class RepoTest01 {
    static void main(String[] args) {
        Repo repo = new FileRepo();
        repo.save();
    }
}
