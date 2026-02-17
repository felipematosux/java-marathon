package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        person.setName("Jiraya");
        person.setAge(70);

        person1.setName("Naruto");
        person1.setAge(17);

        person.print();

        System.out.println("--------------------");

        person1.print();

    }
}
