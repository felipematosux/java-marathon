package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car();


        carOne.name = "Forester";
        carOne.model = "Limited";
        carOne.year = 2009;

        System.out.println("First car: " + carOne.name + " " + carOne.model + ". Year: " + carOne.year);
        
        System.out.println("----------------------");

        carTwo.name = "Prius";
        carTwo.model = "Infinity";
        carTwo.year = 2024;

        System.out.println("Second car: " + carTwo.name + " " + carTwo.model + ". Year: " + carTwo.year);
    }
}
