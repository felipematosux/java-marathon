package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Master Kami";
        professor.age = 140;
        professor.gender = 'M';

        System.out.println("Name: " + professor.name + "; Age: " + professor.age + "; Gender: " + professor.gender);
    }
}
