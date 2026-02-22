package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Shinobi;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Susanoo;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Uchiha;

public class KonohaTest01 {
    static void main(String[] args) {
        System.out.println("==== TESTING INHERITANCE E OVERRIDING ====");

        Uchiha sasuke = new Uchiha("Uchiha Sasuke", "Konoha");
        System.out.println(sasuke);

        sasuke.performJutsu();

        System.out.println("\n==== TESTING METHODS E FINAL CLASSES ====");

        sasuke.awakenMangekyou();

        Susanoo sasukeSusanoo = new Susanoo("purple", sasuke.getName());

        sasukeSusanoo.activateDefense();

        System.out.println("\n==== BONUS TEST OF POLYMORPHISM ====");
        Shinobi itachi = new Uchiha("Itachi", "Konoha");
        itachi.performJutsu();




    }
}
