package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Teacher {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher() {

    }

    public void print() {
        System.out.println("=== Professor: " + this.name + " ===");
        System.out.println("Specialty: " + this.specialty);
        System.out.println("Seminars given:");
        if (this.seminars == null) return;
        for (Seminar seminar : this.seminars) {
            System.out.println(" -" + seminar.getNome());
            System.out.println("Local: " + seminar.getLocation().getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
