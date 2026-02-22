package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public class Uchiha extends Shinobi {
    private final String KEKKEI_GENKAI = "Sharingan";

    @Override
    public void performJutsu() {
        System.out.println("Using Fireball Jutsu!");
    }

    @Override
    public String toString() {
        return super.toString() + " | Specialty: " + KEKKEI_GENKAI;
    }

    public Uchiha(String name, String village) {
        super(name, village);
    }

    public final void awakenMangekyou(){
        System.out.println("Mangekyou Sharingan Awoke!");
    }

    public String getKEKKEI_GENKAI() {
        return KEKKEI_GENKAI;
    }
}
