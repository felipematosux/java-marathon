package academy.devdojo.maratonajava.javacore.Gassossiation.domain;

public class TeamNinja {
    private String name;
    private Ninjas[] ninjas;
    private Mission mission;
    private Sensei sensei;

    public TeamNinja() {

    }

    public TeamNinja(String name, Mission mission) {
        this.name = name;
        this.mission = mission;
    }

    public TeamNinja(String name, Ninjas[] ninjas) {
        this.name = name;
        this.ninjas = ninjas;
    }

    public TeamNinja(String name, Ninjas[] ninjas, Mission mission) {
        this.name = name;
        this.ninjas = ninjas;
        this.mission = mission;
    }

    public TeamNinja(String name, Ninjas[] ninjas, Mission mission, Sensei sensei) {
        this.name = name;
        this.ninjas = ninjas;
        this.mission = mission;
        this.sensei = sensei;
    }

    public void print(){
        System.out.println("==== " + this.name + " ====");

        if(ninjas != null){
            for(Ninjas ninjas1 : ninjas){
                System.out.println(ninjas1.getName() + " - " + ninjas1.getRank());
            }
        }

        System.out.println();
        System.out.println("==== Sensei Details ====");

        if(sensei != null){
            System.out.println(sensei.getName());
            System.out.println("Chakra Nature: " + sensei.getChakraNature());
        }

        System.out.println();
        System.out.println("==== Mission Details ====");

        if(mission != null){
            System.out.println(mission.getTitle());
            System.out.println(mission.getDifficultyRank());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ninjas[] getNinjas() {
        return ninjas;
    }

    public void setNinjas(Ninjas[] ninjas) {
        this.ninjas = ninjas;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Sensei getSensei() {
        return sensei;
    }

    public void setSensei(Sensei sensei) {
        this.sensei = sensei;
    }
}
