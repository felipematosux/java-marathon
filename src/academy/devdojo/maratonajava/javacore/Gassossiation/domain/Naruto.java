package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Naruto {
    private String name;
    private Frog invocationJutsu;

    public Naruto(String name){
        this.name = name;
    }

    public void callFrog(Frog invocationJutsu){
        this.invocationJutsu = invocationJutsu;
        if (this.invocationJutsu == null) return;
        System.out.println(invocationJutsu.getName() + " appears!");
    }

    public void useFrog(Frog invocationJutsu){
        this.invocationJutsu = invocationJutsu;
        if (this.invocationJutsu == null) return;
        System.out.println(this.name + " says: ATTACK!!");
        System.out.println(invocationJutsu.getName() + " uses his KATANA!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
