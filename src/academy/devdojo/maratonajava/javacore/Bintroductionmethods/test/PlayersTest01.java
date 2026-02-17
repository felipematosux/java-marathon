package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Players;

public class PlayersTest01 {
    public static void main(String[] args) {
        Players player1 = new Players();
        Players player2 = new Players();
        Players player3 = new Players();
        Players player4 = new Players();
        Players player5 = new Players();


        System.out.println("=============================");
        System.out.println("LIST OF PLAYERS:");
        System.out.println("=============================");

        player1.setName("Hulk");
        player1.setPosition("Forward");
        player1.setAge(41);
        player1.setStars(4);

        player2.setName("Everson");
        player2.setPosition("Goalkeeper");
        player2.setAge(32);
        player2.setStars(5);

        player3.setName("Renan Lodi");
        player3.setPosition("Left Back");
        player3.setAge(26);
        player3.setStars(5);

        player4.setName("Gustavo Scarpa");
        player4.setPosition("Midfielder");
        player4.setAge(31);
        player4.setStars(4);

        player5.setName("Junior Alonso");
        player5.setPosition("Centre Back");
        player5.setAge(34);
        player5.setStars(2);

        player1.printer();
        player2.printer();
        player3.printer();
        player4.printer();



    }
}
