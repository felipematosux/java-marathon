package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Ninjas {
    private String name;
    private String rank;
    private TeamNinja team;

    public Ninjas(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public Ninjas(String name, String rank, TeamNinja team) {
        this.name = name;
        this.rank = rank;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public TeamNinja getTeam() {
        return team;
    }

    public void setTeam(TeamNinja team) {
        this.team = team;
    }
}
