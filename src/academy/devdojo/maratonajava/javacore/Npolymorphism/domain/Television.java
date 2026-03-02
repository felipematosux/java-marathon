package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Television extends Product{
    public static final double TAX_PERCENTAGE = 0.21;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTax() {
        System.out.println("Calculating TV's tax");
        return this.price * TAX_PERCENTAGE;
    }
}
