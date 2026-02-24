package academy.devdojo.maratonajava.javacore.Kenums.exercise;

public enum PokemonType {
    FIRE ("Fogo"),
    WATER("Água"),
    GRASS("Grama"),
    DRAGON("Dragão");

    private String nameBR;

    PokemonType(String nameBR) {
        this.nameBR = nameBR;
    }
}
