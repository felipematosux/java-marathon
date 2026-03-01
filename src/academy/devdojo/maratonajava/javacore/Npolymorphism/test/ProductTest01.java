package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolymorphism.services.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Acer Nitro", 6000);
        Tomato tomato = new Tomato("Hawaiian Tomato", 10);


        TaxCalculator.computerTaxCalculation(computer);
        System.out.println("---------------------------");
        TaxCalculator.tomatoTaxCalculation(tomato);

    }
}
