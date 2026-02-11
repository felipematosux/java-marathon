package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Players;

public class PlayersTest01 {
    public static void main(String[] args) {
        Players player1 = new Players();
        Players player2 = new Players();
        Players player3 = new Players();
        Players player4 = new Players();
        Players player5 = new Players();

        player1.name = "Hulk";
        player1.position = "Forward";
        player1.age = 41;
        player1.stars = 4;

        player2.name = "Everson";
        player2.position = "Goalkeeper";
        player2.age = 32;
        player2.stars = 5;

        player3.name = "Renan Lodi";
        player3.position = "Left Back";
        player3.age = 26;
        player3.stars = 5;

        player4.name = "Gustavo Scarpa";
        player4.position = "Midfielder";
        player4.age = 31;
        player4.stars = 4;

        player5.name = "Junior Alonso";
        player5.position = "Centre Back";
        player5.age = 34;
        player5.stars = 2;

        System.out.println("Player 1 Registered!");
        System.out.println("Player Name: " + player1.name);
        System.out.println("Player Age : " + player1.age);
        System.out.println("Player Position: " + player1.position);
        System.out.println("Player Stars : " + player1.stars);
        System.out.println("-----------------------");

        System.out.println("Player 2 Registered!");
        System.out.println("Player Name: " + player2.name);
        System.out.println("Player Age : " + player2.age);
        System.out.println("Player Position: " + player2.position);
        System.out.println("Player Stars : " + player2.stars);
        System.out.println("-----------------------");

        System.out.println("Player 3 Registered!");
        System.out.println("Player Name: " + player3.name);
        System.out.println("Player Age : " + player3.age);
        System.out.println("Player Position: " + player3.position);
        System.out.println("Player Stars : " + player3.stars);
        System.out.println("-----------------------");

        System.out.println("Player 4 Registered!");
        System.out.println("Player Name: " + player4.name);
        System.out.println("Player Age : " + player4.age);
        System.out.println("Player Position: " + player4.position);
        System.out.println("Player Stars : " + player4.stars);
        System.out.println("-----------------------");

        System.out.println("Player 5 Registered!");
        System.out.println("Player Name: " + player5.name);
        System.out.println("Player Age : " + player5.age);
        System.out.println("Player Position: " + player5.position);
        System.out.println("Player Stars : " + player5.stars);
        System.out.println("-----------------------");


    }
}
