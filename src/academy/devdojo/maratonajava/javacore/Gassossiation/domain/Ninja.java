package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Ninja {
    private String name;
    private Frog invocationJutsu;
    private Frog[] frogTeam;

    public Ninja(String name){
        this.name = name;
    }

    public Ninja(String name, Frog invocationJutsu) {
        this.name = name;
        this.invocationJutsu = invocationJutsu;
    }

    public Ninja(String name, Frog invocationJutsu, Frog[] frogTeam) {
        this.name = name;
        this.invocationJutsu = invocationJutsu;
        this.frogTeam = frogTeam;
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

    public void useFrogTeam(){
        System.out.println("Frogs in the Team:");
        if (this.frogTeam == null) return;
        for (Frog frog : this.frogTeam) {
            System.out.println(frog.getName());
        }
        System.out.println("--------------------");
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

    public Frog[] getFrogTeam() {
        return frogTeam;
    }

    public void setFrogTeam(Frog[] frogTeam) {
        this.frogTeam = frogTeam;
    }
}
