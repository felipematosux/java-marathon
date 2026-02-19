package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import java.util.Scanner;

public class KeyboardReaderTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our Website!");
        System.out.println("--------------------");

        System.out.println("What is your name?");
        String name =  input.nextLine();

        System.out.println("What is your age?");
        int age = input.nextInt();

        System.out.println("What is your sex (M/F)?");
        char sex = input.next().charAt(0);

        System.out.println("--------------------");

        System.out.println("Thanks for registering!");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (sex == 'M') {
            System.out.println("Sex: Male");
        } else {
            System.out.println("Sex: Female");
        }

        System.out.println("--------------------");

    }
}
