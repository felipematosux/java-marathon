package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Mission {
    private String title;
    private String difficultyRank;

    public Mission(String title, String difficultyRank) {
        this.title = title;
        this.difficultyRank = difficultyRank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDifficultyRank() {
        return difficultyRank;
    }

    public void setDifficultyRank(String difficultyRank) {
        this.difficultyRank = difficultyRank;
    }
}
