package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee01 = new Employee();

        employee01.setName("Hulk");
        employee01.setAge(40);
        employee01.setSalary(new double[]{5000, 3500,1300});

        employee01.printData();




    }
}
