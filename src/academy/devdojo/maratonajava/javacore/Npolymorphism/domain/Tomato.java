package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTax() {
        System.out.println("Calculating tomato's tax");
        return this.price * TAX_PERCENTAGE;
    }
}
