package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }

        try {
            person.save();
        }catch (InvalidLoginException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
