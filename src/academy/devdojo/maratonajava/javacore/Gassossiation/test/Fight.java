package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Frog;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Naruto;

public class Fight {
    public static void main(String[] args) {
        Naruto naruto = new Naruto("Naruto");
        Naruto sasuke = new Naruto("Sasuke");

        Frog frog = new Frog("Gamabunta");
        Frog frog2 = new Frog("Nagini");
        Frog frog3 = new Frog("Gamakichi");

        naruto.setInvocationJutsu(frog);
        sasuke.setInvocationJutsu(frog2);

        Frog[] frogTeam = {frog, frog2, frog3};

        frog.setFrogs(frogTeam);

        naruto.callFrog();
        naruto.useFrog();

        sasuke.callFrog();
        sasuke.useFrog();







    }
}
