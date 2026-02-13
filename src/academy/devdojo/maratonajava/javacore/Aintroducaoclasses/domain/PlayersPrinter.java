package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain;

public class PlayersPrinter {
    public void print(Players players){
        System.out.println("Player:");
        System.out.println("Name: " + players.name);
        System.out.println("Position: " + players.position);
        System.out.println("Age: " + players.age);
        System.out.println("Stars: " + players.stars);
        System.out.println("----------------------");
    }
}
