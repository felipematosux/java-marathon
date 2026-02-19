package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Student {
    private String nome;
    private int age;
    private Seminar seminar;

    public Student(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public Student() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
