package academy.devdojo.maratonajava.javacore.Kenums.exercise;

public class StarterPokemon extends Pokemon {
    private final String region;

    public StarterPokemon(String name, int level, PokemonType pokemonType, String region) {
        super(name, level, pokemonType);
        this.region = region;
    }

    @Override
    public String toString() {
        return "Pokemon Name: " + name + " | level: " + level + " | pokemonType: " + pokemonType + " | Region: " +  region;
    }

    public final void evolve(){
        System.out.println("The " + this.name + " is evolving!");
    }

    public String getRegion() {
        return region;
    }
}
