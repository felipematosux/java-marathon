package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class PrinterEmployee {

    public void printData(Employee employee) {
        System.out.println("Employee:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
    }

    public void printSalary(int... numbers) {
        double sum = 0;
        double average = 0;
        for (double num : numbers ) {
            sum += num;
            average = sum / numbers.length;
        }
        System.out.println("Average: " + average);

    }
}
