package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class PrinterStudent {
    public void print(Student student) {
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        System.out.println("-------------------------");

        student.name = "Gohan";
    }
}
