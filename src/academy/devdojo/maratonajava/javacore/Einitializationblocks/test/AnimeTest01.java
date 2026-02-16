package academy.devdojo.maratonajava.javacore.Einitializationblocks.test;

import academy.devdojo.maratonajava.javacore.Einitializationblocks.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Naruto");
        Anime anime2 = new Anime();

        for (int episode : anime1.getEpisodes()){
            System.out.print(episode + " ");
        }
    }
}
