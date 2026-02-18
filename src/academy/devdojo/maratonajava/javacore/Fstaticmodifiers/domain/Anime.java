package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    static {
        episodes = new int[100];
        for(int i = 0; i < episodes.length; i++){
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for(int episode : Anime.episodes){
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public int[] getEpisodes() {
        return Anime.episodes;
    }
}
