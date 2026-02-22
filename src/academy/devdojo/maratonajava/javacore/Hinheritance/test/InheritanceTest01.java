package academy.devdojo.maratonajava.javacore.Hinheritance.test;

import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Address;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua Carindé");
        address.setZipcode("32681-412");

        Person person = new Person("Luffy D. Luffy");
        person.setSocialSecurityNumber("3254152322");
        person.setAddress(address);

        person.print();

        System.out.println("--------------------------");

        Employee employee = new Employee("Oda Nobunaga");
        employee.setSocialSecurityNumber("3254152322");
        employee.setAddress(address);
        employee.setSalary(20000);
        employee.print();

        employee.paymentReport();


    }
}
