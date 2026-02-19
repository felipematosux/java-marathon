package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Frog {
    private String name;
    private String[] frogs;

    public Frog(String name) {
        this.name = name;
    }

    public Frog(String name, String[] frogs) {
        this.name = name;
        this.frogs = frogs;
    }

    public void callFrogs() {
        if (this.frogs == null) return;
        for (String frog : frogs) {
            System.out.println("Frogs Available:");
            System.out.println(frog);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFrogs() {
        return frogs;
    }

    public void setFrogs(String[] frogs) {
        this.frogs = frogs;
    }
}
