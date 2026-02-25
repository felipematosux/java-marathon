package academy.devdojo.maratonajava.javacore.Kenums.exercise;

public enum PokemonType {
    FIRE ("Fogo"),
    WATER("Água"),
    GRASS("Grama"),
    DRAGON("Dragão"){
        @Override
        public String getEffectiveness() {
            return "Dragons are weak against Ice";
        }
    },
    ELECTRIC("Elétrico");

    private String nameBR;

    PokemonType(String nameBR) {
        this.nameBR = nameBR;
    }

    public static PokemonType typeForBrName(String nameBR) {
        for (PokemonType type : PokemonType.values()) {
            if (type.nameBR.equals(nameBR)){
                return type;
            }
        }
        return null;
    }

    public String getEffectiveness() {
        return  "Default attack!";
    }

    public String getNameBR() {
        return nameBR;
    }
}
