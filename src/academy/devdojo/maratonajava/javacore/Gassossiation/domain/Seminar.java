package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Seminar {
    private String nome;
    private Location location;
    private Student[] students;

    public Seminar(String nome, Location location, Student[] students) {
        this.nome = nome;
        this.location = location;
        this.students = students;
    }

    public Seminar(String nome, Location location) {
        this.nome = nome;
        this.location = location;
    }

    public void print() {
        System.out.println("--- Seminar: " + this.nome + " ---");
        if (this.location != null) {
            System.out.println("Location: " + this.location.getName());
        }
        System.out.println("Students:");
        if (this.students == null) return;
        for (Student student : this.students) {
            System.out.println(" -" + student.getNome() + " Age: " + student.getAge());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
