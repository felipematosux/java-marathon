package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Employee;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.PrinterEmployee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employeeData = new Employee();
        PrinterEmployee employeePrinterData = new PrinterEmployee();

        employeeData.name = "Hulk";
        employeeData.age = 40;

        employeePrinterData.printData(employeeData);
        employeePrinterData.printSalary(5000,3500,1300);
        employeePrinterData.printAverage(5000,3500,1300);


    }
}
