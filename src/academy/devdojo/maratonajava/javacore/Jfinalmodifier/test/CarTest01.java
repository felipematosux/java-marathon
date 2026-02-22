package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Buyer buyer1 = new Buyer();

        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car1.BUYER);
        car1.BUYER.setName("Juan");
        System.out.println(car1.BUYER);
    }
}
