package academy.devdojo.maratonajava.javacore.Dbuilders.test;

import academy.devdojo.maratonajava.javacore.Dbuilders.domain.Players;

public class PlayersTest01 {
    public static void main(String[] args) {
        Players player1 = new Players("Hulk", "Forward", 40, 3500000, 'A');
        Players player2 = new Players();
        Players player3 = new Players("Dudu", "Left Winger", 32, 2500000, 'B', new String[]{"Cruzeiro", "Palmeiras", "Al-Duhail", "Gremio"});
        Players player4 = new Players();

        player2.init("Everson", "Goalkeeper", 35, 5000000, 'A');
        player4.init("Cassiera", "Centre Forward", 28, 8000000, 'B', new String[]{"Zenit", "Sochi"});



        player1.print();
        player2.print();
        player3.print();
        player4.print();
    }
}
