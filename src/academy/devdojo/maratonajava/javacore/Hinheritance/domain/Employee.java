package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String socialSecurityNumber, Address address) {
        super(name, socialSecurityNumber, address);
    }

    public double getSalary() {
        return salary;
    }

    public void print(){
        super.print();
        System.out.println("Salary: $" + this.salary);
    }

    public void paymentReport(){
        System.out.println("==============================================================");
        System.out.println("--- Payment Report: ---");
        System.out.println("I, " + this.name + " received the amount of $" + this.salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
