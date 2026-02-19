package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Frog {
    private String name;
    private Frog[] frogs;

    public Frog(String name) {
        this.name = name;
    }

    public Frog(String name, Frog[] frogs) {
        this.name = name;
        this.frogs = frogs;
    }

    public void callFrogs(String[] frogs) {
        System.out.println("Frogs Available:");
        if (this.frogs == null || this.frogs.length == 0) return;
        for (Frog frog : frogs) {
            System.out.println(frog.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Frog[] getFrogs() {
        return frogs;
    }

    public void setFrogs(Frog[] frogs) {
        this.frogs = frogs;
    }
}
