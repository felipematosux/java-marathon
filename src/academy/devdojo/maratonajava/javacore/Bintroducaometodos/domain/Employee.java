package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double average;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double[] getSalary() {
        return this.salary;
    }

    public double getAverage() {
        return this.average;
    }

    public void printData() {
        System.out.println("Employee:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        if (this.salary == null) {
            return;
        }

        for (double salaries : salary ) {
            System.out.print("R$" + salaries + " ");
        }
        printAverage();
    }

    public void printAverage() {
        if (salary == null) {
            return;
        }
        for (double num : salary ) {
            average += num;
        }
        average /= salary.length;

        System.out.println("\nAverage salary: " + average);
    }
}
