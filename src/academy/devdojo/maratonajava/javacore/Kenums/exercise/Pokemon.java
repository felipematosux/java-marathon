package academy.devdojo.maratonajava.javacore.Kenums.exercise;

public class Pokemon {
    protected String name;
    protected int level;
    protected PokemonType pokemonType;

    public Pokemon(String name, int level, PokemonType pokemonType) {
        this.name = name;
        this.level = level;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {
        return "Pokemon Name: " + name + " | level: " + level + " | pokemonType: " + pokemonType.getNameBR();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PokemonType getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(PokemonType pokemonType) {
        this.pokemonType = pokemonType;
    }
}
