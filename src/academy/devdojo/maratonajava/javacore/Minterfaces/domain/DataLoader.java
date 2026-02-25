package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public abstract void load();
    default void checkPermission(){
        System.out.println("Checking permission...");
    };
}
