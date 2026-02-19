package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Frog;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Ninja;

public class FightTest01 {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto");
        Ninja sasuke = new Ninja("Sasuke");

        Frog gamabunta = new Frog("Gamabunta");
        Frog nagini = new Frog("Nagini");
        Frog gamakichi = new Frog("Gamakichi");

        Frog[] frogTeam = {gamabunta, nagini, gamakichi};

        ninja.setInvocationJutsu(gamabunta);
        sasuke.setInvocationJutsu(nagini);

        Frog[] invocationTeam = {gamabunta, nagini, gamakichi};

        gamabunta.setFrogs(frogTeam);


        ninja.callFrog();
        ninja.useFrog();

        sasuke.callFrog();
        sasuke.useFrog();

        gamabunta.callFrogs();

        sasuke.setFrogTeam(invocationTeam);

        sasuke.useFrogTeam();







    }
}
