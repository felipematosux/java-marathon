package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Action");
        Anime anime2 = new Anime("Naruto", "Internet", 253, "Adventure");
        Anime anime3 = new Anime("One Piece", "Streaming", 1350, "Adventure", "TV Tokio");

        anime.print();
        System.out.println("----------------");
        anime2.print();
        System.out.println("---------------");
        anime3.print();

    }
}
