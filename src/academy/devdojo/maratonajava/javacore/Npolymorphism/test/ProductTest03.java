package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolymorphism.services.TaxCalculator;

public class ProductTest03 {
    static void main(String[] args) {
        Product computer = new Computer("Rog Stryx", 5000);
        Tomato tomato = new Tomato("American", 3);
        tomato.setExpirationDate("5/10/2026");

        TaxCalculator.taxCalculation(tomato);
        System.out.println("--------------------");
        TaxCalculator.taxCalculation(computer);




    }
}
