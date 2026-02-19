package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Frog;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Naruto;

public class Fight {
    static void main(String[] args) {
        Naruto naruto = new Naruto("Naruto");
        Frog frog = new Frog("Gamabunta");
        Frog frog2 = new Frog("Gamakichi");

        Frog[] frogs = {frog, frog2};

        naruto.print();

        naruto.print();


    }
}
