package academy.devdojo.maratonajava.javacore.Npolymorphism.services;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;

public class TaxCalculator {
    public static void computerTaxCalculation(Computer computer){
        System.out.println("Computer's tax report");
        double tax = computer.getTax();
        System.out.println("Computer: " + computer.getName());
        System.out.println("Price: " + computer.getPrice());
        System.out.println("Tax: " + tax);
    }

    public static void tomatoTaxCalculation(Tomato tomato){
        System.out.println("Tomato's tax report");
        double tax = tomato.getTax();
        System.out.println("Tomato: " + tomato.getName());
        System.out.println("Price: " + tomato.getPrice());
        System.out.println("Tax: " + tax);
    }
}
