package academy.devdojo.maratonajava.javacore.Kenums.exercise;

public class Trainer {
    private String name;
    private StarterPokemon[] starterPokemonTeam;

    public Trainer(String name, StarterPokemon[] starterPokemonTeam) {
        this.name = name;
        this.starterPokemonTeam = starterPokemonTeam;
    }

    public void printTeam(){
        if(this.starterPokemonTeam != null){
            for (StarterPokemon starterPokemon : this.starterPokemonTeam) {
                System.out.println(starterPokemon.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarterPokemon[] getStarterPokemonTeam() {
        return starterPokemonTeam;
    }

    public void setStarterPokemonTeam(StarterPokemon[] starterPokemonTeam) {
        this.starterPokemonTeam = starterPokemonTeam;
    }
}
