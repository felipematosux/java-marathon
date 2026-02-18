package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Player;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Position;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Team;

public class PlayerTest02 {
    static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Ronaldinho");
        Player player3 = new Player("Neymar Jr.");

        Team team1 = new Team("Santos");
        Team team2 = new Team("Atlético Mineiro");

        Position forward = new Position("Forward");
        Position centralMidfielder = new Position("Central Midfielder");
        Position leftWing = new Position("Left Wing");

        player1.setTeam(team1);
        player2.setTeam(team2);
        player3.setTeam(team1);

        player1.setPosition(forward);
        player2.setPosition(centralMidfielder);
        player3.setPosition(leftWing);

        player1.print();
        player2.print();
        player3.print();


    }
}
