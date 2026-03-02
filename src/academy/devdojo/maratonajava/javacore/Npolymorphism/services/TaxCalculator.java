package academy.devdojo.maratonajava.javacore.Npolymorphism.services;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;


public class TaxCalculator {

    public static void taxCalculation(Product product) {
        System.out.println("Tax Report!");
        double tax = product.getTax();
        System.out.println("Item: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax: " + tax);
        if(product instanceof Tomato) {
            System.out.println("Expiration date: " + ((Tomato)product).getExpirationDate());
        }

    }
}
