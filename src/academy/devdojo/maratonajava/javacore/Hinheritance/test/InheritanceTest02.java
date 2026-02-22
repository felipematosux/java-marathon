package academy.devdojo.maratonajava.javacore.Hinheritance.test;

import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Employee;

public class InheritanceTest02 {

    // 0 - Superclass static initialization block is executed when the JVM loads the parent class.
    // 1 - Subclass static initialization block is executed when the JVM loads the child class.
    // 2 - Memory space is allocated for the superclass object.
    // 3 - Each superclass attribute is created and initialized with default values or provided values.
    // 4 - Superclass initialization block is executed in the order it appears.
    // 5 - Superclass constructor is executed.
    // 6 - Memory space is allocated for the subclass object.
    // 7 - Each subclass attribute is created and initialized with default values or provided values.
    // 8 - Subclass initialization block is executed in the order it appears.
    // 9 - Subclass constructor is executed.

    public static void main(String[] args) {
        Employee employee = new Employee("Maria");


    }
}
