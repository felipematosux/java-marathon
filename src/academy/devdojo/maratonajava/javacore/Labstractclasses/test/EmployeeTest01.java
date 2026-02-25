package academy.devdojo.maratonajava.javacore.Labstractclasses.test;

import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Developer;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Employee;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Nami", 5000);
        System.out.println(manager1);

        Developer developer1 = new Developer("Usopp", 12000);
        System.out.println(developer1);

        developer1.print();
        manager1.print();
    }
}
