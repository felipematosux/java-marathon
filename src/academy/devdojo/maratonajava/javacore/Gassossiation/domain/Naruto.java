package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Naruto {
    private String name;
    private Frog invocationJutsu;

    public Naruto(String name){
        this.name = name;
    }

    public Naruto(String name, Frog invocationJutsu) {
        this.name = name;
        this.invocationJutsu = invocationJutsu;
    }

    public void callFrog(){
        if (invocationJutsu == null) return;
        System.out.println(invocationJutsu.getName() + " appears!");
    }

    public void useFrog(){
        System.out.println(this.name + " says: ATTACK!!");
        if (this.invocationJutsu == null) return;
        System.out.println(invocationJutsu.getName() + " uses his KATANA!");
        System.out.println("---------------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Frog getInvocationJutsu() {
        return invocationJutsu;
    }

    public void setInvocationJutsu(Frog invocationJutsu) {
        this.invocationJutsu = invocationJutsu;
    }
}
