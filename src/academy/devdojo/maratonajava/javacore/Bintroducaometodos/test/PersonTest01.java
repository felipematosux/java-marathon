package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        person.setName("Jiraya");
        person.setAge(70);

        person1.setName("Naruto");
        person1.setAge(17);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println("--------------------");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}
