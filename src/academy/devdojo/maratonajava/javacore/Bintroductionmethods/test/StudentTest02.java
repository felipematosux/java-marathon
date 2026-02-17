package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Naruto";
        student01.age = 17;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 16;
        student02.gender = 'F';

        student01.print();
        student02.print();



    }
}
