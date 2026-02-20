package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Sensei {
    private String name;
    private String chakraNature;
    private TeamNinja[] team;

    public Sensei(String name, String chakraNature, TeamNinja teamSeven) {
        this.name = name;
        this.chakraNature = chakraNature;
    }

    public Sensei(String name, String chakraNature, TeamNinja[] team) {
        this.name = name;
        this.chakraNature = chakraNature;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChakraNature() {
        return chakraNature;
    }

    public void setChakraNature(String chakraNature) {
        this.chakraNature = chakraNature;
    }

    public TeamNinja[] getTeam() {
        return team;
    }

    public void setTeam(TeamNinja[] team) {
        this.team = team;
    }
}
