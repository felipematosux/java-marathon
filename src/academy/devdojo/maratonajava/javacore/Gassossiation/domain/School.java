package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public void print(){
        System.out.println("Information:");
        System.out.println("School: " + this.name);
        if (this.professors == null) return;
        for (Professor professor : this.professors) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("---------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
