package academy.devdojo.maratonajava.javacore.Cmethodsoverload.test;

import academy.devdojo.maratonajava.javacore.Cmethodsoverload.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();

        anime.init("Akudama Drive", "TV", 12, "Action");
        anime2.init("Naruto", "Internet", 253, "Adventure");

        anime.print();
        anime2.print();

    }
}
