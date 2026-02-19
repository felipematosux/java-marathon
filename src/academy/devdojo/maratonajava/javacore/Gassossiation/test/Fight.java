package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Frog;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Naruto;

public class Fight {
    static void main(String[] args) {
        Naruto naruto = new Naruto("Naruto");
        Frog frog = new Frog("Gamabunta");

        naruto.callFrog(frog);

        naruto.useFrog(frog);
    }
}
