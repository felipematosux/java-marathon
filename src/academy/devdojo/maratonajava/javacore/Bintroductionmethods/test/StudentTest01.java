package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.PrinterStudent;
import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrinterStudent printer = new PrinterStudent();

        student01.name = "Midoriya";
        student01.age = 15;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 16;
        student02.gender = 'F';

        printer.print(student01);
        printer.print(student02);

        System.out.println("##############################");

        printer.print(student01);
        printer.print(student02);

    }
}
