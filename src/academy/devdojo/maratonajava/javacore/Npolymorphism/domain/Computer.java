package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENTAGE = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTax() {
        System.out.println("Calculating computer's tax");
        return this.price * TAX_PERCENTAGE;
    }


}
