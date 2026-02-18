package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class Player {
    private String name;
    private Team team;
    private Position position;

    public void print(){
        System.out.println(this.name);
        if (team != null){
            System.out.println(team.getName());
        }
        if (position != null){
            System.out.println(position.getPosition());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
