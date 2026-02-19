package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Location;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Seminar;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Student;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Teacher;

public class ExerciseTest01 {
    /**
     * SEMINAR MANAGEMENT SYSTEM EXERCISE

     Create a system to manage academic seminars.

     The system must register: seminars, students, teachers, and locations.

     * BUSINESS RULES & RELATIONSHIPS:
     1. Student: A student can be enrolled in only ONE seminar.
     2. Seminar: A seminar can have ZERO or MANY students.
     3. Teacher: A teacher can teach ONE or MANY seminars.
     4. Seminar: A seminar must have ONE location.

     * BASIC FIELDS (Excluding relationships):
     - Seminar: title
     - Student: name, age
     - Teacher: name, specialty
     - Location: address
     */
    public static void main(String[] args) {

        Location location1 = new Location("Mineirão - BH");
        Location location2 = new Location("Expominas - BH");

        Student student1 = new Student("Hulk",40);
        Student student2 = new Student("Cuello",25);

        Seminar seminar1 = new Seminar("How to play soccer", location1);
        Seminar seminar2 = new Seminar("How to pass the ball", location2);

        Teacher teacher1 = new Teacher("Pelé","Ataque");

        Student[] studentsSeminary = {student1,student2};

        seminar1.setStudents(studentsSeminary);

        student1.setSeminar(seminar1);
        student2.setSeminar(seminar1);

        Seminar[] seminars = {seminar1,seminar2};

        teacher1.setSeminars(seminars);

        System.out.println("===== SYSTEM OVERVIEW =====\n");

        teacher1.print();

        System.out.println("\n----------------------------------------------\n");

        seminar1.print();








        teacher1.print();

        seminar1.print();




    }
}
