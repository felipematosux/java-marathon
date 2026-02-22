package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public final class Susanoo {
    private String color;
    private String wielder;

    public Susanoo(String color, String wielder) {
        this.color = color;
        this.wielder = wielder;
    }

    public void activateDefense(){
        System.out.println("Absolute Susanoo activated!");
        System.out.println(color + " aura chakra, involving " + wielder);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWielder() {
        return wielder;
    }

    public void setWielder(String wielder) {
        this.wielder = wielder;
    }
}
