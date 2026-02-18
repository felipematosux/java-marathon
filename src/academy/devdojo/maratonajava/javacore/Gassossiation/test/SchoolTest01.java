package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors = {professor1, professor2};
        School school1 = new School("Konoha", professors);

        school1.print();

        Professor professor3 = new Professor("Gaara");
        Professor professor4 = new Professor("Temari");
        Professor[] professors1 =  {professor3, professor4};

        School school2 = new School("Deserto", professors1);

        school2.print();




    }
}
