package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.exercise.*;

public class PokemonTest01 {

    /**
     * POKÉMON TEAM MANAGEMENT SYSTEM (GEN 3 FOCUS)
     *
     * Objetivo: Criar um sistema de gerenciamento de Pokémon utilizando Enums avançados,
     * Herança, Associações e Modificadores de Acesso/Não-Acesso.
     *
     * REGRAS DE NEGÓCIO E ARQUITETURA:
     * * 1. ENUMERADOR (O Coração do Sistema):
     * - Crie um enum chamado `PokemonType`.
     * - Constantes: FIRE, WATER, GRASS, DRAGON.
     * - Atributo: `nomeBR` (ex: "Fogo", "Água"). O construtor do enum deve receber isso.
     * - Busca por Atributo: Crie um método `public static PokemonType tipoPorNomeBR(String nomeBR)`
     * que varre o enum e retorna o tipo correto, ou null se não achar.
     * - Sobrescrita no Enum: Declare um método genérico `public String getEffectiveness()` no enum
     * e SOBRESCREVA esse método APENAS na constante DRAGON para retornar "Dragões são fracos contra Gelo!".
     * Os outros tipos podem retornar "Efetividade padrão".
     *
     * 2. SUPERCLASSE:
     * - Crie a classe `Pokemon`.
     * - Atributos `protected`: `name` (String), `level` (int), `type` (PokemonType - ASSOCIAÇÃO 1:1).
     * - Construtor que recebe os 3 atributos.
     * - Sobrescreva o método `toString()` para imprimir os dados do Pokémon e o seu `nomeBR` do Enum.
     *
     * 3. HERANÇA E FINAL (Subclasses):
     * - Crie uma classe `StarterPokemon` que herda (extends) de `Pokemon`.
     * - Atributo: `private final String region` (Ex: "Hoenn").
     * - Use o `super()` no construtor para passar nome, level e tipo para a classe pai.
     * - Crie um método `public final void evolve()`. Ele deve imprimir que o Pokémon evoluiu,
     * mas como é `final`, nenhum outro desenvolvedor poderá alterar como a evolução funciona.
     *
     * - Crie uma classe `LegendaryPokemon`.
     * - Essa classe DEVE SER `final` (Ninguém pode herdar de um lendário como o Rayquaza).
     * - Atributo: `private final String signatureMove`.
     * - Construtor com `super()` e o movimento especial.
     *
     * 4. ASSOCIAÇÃO 1:N (O Treinador):
     * - Crie a classe `Trainer`.
     * - Atributos: `name` (String) e `StarterPokemon[] team` (Array de pokémons iniciais).
     * - Método `printTeam()` com verificação de segurança (null check) para imprimir a equipe.
     */

    public static void main(String[] args) {

        System.out.println("==== 1. ENUM TESTING (Search & Overriding) ====");
        PokemonType typeGrass = PokemonType.typeForBrName("Grama");
        System.out.println("Search by 'Grama': " + typeGrass);
        System.out.println("Fire Effectiveness: " + PokemonType.FIRE.getEffectiveness());
        System.out.println("Dragon Effectiveness: " + PokemonType.DRAGON.getEffectiveness());

        System.out.println("\n==== 2. INHERITANCE & FINAL METHOD TESTING ====");
        StarterPokemon torchic = new StarterPokemon("Torchic", 5, PokemonType.FIRE, "Hoenn");
        StarterPokemon mudkip = new StarterPokemon("Mudkip", 5, PokemonType.WATER, "Hoenn");
        StarterPokemon treecko = new StarterPokemon("Treecko", 5, PokemonType.GRASS, "Hoenn");

        System.out.println(torchic);
        torchic.evolve();

        System.out.println("\n==== 3. FINAL CLASS TESTING (Legendary) ====");
        LegendaryPokemon rayquaza = new LegendaryPokemon("Rayquaza", 70, PokemonType.DRAGON, "Dragon Ascent");
        System.out.println(rayquaza);
        System.out.println("Signature Move: " + rayquaza.getSignatureMove());

        System.out.println("\n==== 4. 1:N ASSOCIATION TESTING (Trainer) ====");
        StarterPokemon[] hoennTeam = {torchic, mudkip, treecko};
        Trainer brendan = new Trainer("Brendan", hoennTeam);

        brendan.printTeam();
    }
}
