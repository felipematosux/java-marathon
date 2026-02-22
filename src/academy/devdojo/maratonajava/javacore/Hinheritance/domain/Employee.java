package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Employee extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void print(){
        super.print();
        System.out.println("Salary: $" + this.salary);
    }

    public void paymentRelatory(){
        System.out.println("I, " + this.name + " received the amount of $" + this.salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
