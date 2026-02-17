package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Players {
    private String name;
    private int age;
    private String position;
    private int stars;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age!");
            return;
        }
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPosition() {
        return this.position;
    }

    public int getStars() {
        return this.stars;
    }

    public void printer() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Position: " + this.position);
        System.out.println("Stars: " + this.stars);
        System.out.println("----------------------");
    }



}
