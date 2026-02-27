package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

import academy.devdojo.maratonajava.javacore.Gassossiation.test.Rank;

public class Ninjas {
    private String name;
    private Rank rank;
    private TeamNinja team;

    public Ninjas(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public Ninjas(String name, Rank rank, TeamNinja team) {
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

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public TeamNinja getTeam() {
        return team;
    }

    public void setTeam(TeamNinja team) {
        this.team = team;
    }
}
