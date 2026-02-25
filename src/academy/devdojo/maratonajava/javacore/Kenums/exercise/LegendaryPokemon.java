package academy.devdojo.maratonajava.javacore.Kenums.exercise;

public final class LegendaryPokemon extends Pokemon {

    private final String signatureMove;

    @Override
    public String toString() {
        return "Pokemon Name: " + name + " | level: " + level + " | pokemonType: " + pokemonType + " | Signature Move: " + signatureMove;
    }

    public LegendaryPokemon(String name, int level, PokemonType pokemonType, String signatureMove) {
        super(name, level, pokemonType);
        this.signatureMove = signatureMove;
    }

    public String getSignatureMove() {
        return signatureMove;
    }
}
