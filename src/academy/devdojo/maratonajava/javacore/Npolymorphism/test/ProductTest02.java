package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Television;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolymorphism.services.TaxCalculator;

public class ProductTest02 {
    static void main(String[] args) {
        Product product = new Computer("Rog Stryx", 5000);
        Product product2 = new Tomato("American", 3);
        Product product3 = new Television("LG C1", 5000);


        TaxCalculator.taxCalculation(product);
        System.out.println("-------------------------------");

        TaxCalculator.taxCalculation(product2);
        System.out.println("-------------------------------");

        TaxCalculator.taxCalculation(product3);
        System.out.println("-------------------------------");


    }
}
