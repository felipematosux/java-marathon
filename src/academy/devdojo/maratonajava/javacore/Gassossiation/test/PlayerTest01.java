package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Player;

public class PlayerTest01 {
    static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romário");
        Player player3 = new Player("Cafú");

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }

    }
}
