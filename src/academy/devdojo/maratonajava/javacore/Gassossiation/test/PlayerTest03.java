package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {

        Player player1 = new Player("Cafú");
        Player player2 = new Player("Pelé");
        Team team = new Team("Brazil");
        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("--- Player ---");
        player1.print();

        System.out.println("--- Team ---");
        team.print();
    }
}
