package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public class Shinobi {
    protected String name;
    protected String village;

    @Override
    public String toString() {
        return "Shinobi: " + this.name +" from " + this.village + " Village!";
    }

    public Shinobi(String name, String village) {
        this.name = name;
        this.village = village;
    }

    public void performJutsu(){
        System.out.println("Performing basic Jutsu!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}
