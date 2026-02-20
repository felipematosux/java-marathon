package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Mission;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Ninjas;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.Sensei;
import academy.devdojo.maratonajava.javacore.Gassossiation.domain.TeamNinja;

public class KonohaTest01 {
    /**
     * KONOHA TEAM MANAGEMENT SYSTEM EXERCISE

     Create a system to manage ninja teams in the Hidden Leaf Village.
     The system must register: Teams, Ninjas, Senseis, and Missions.

     * BUSINESS RULES & RELATIONSHIPS:
     1. Ninja: A ninja can belong to only ONE Team.
     2. Team: A team can have ZERO or MANY Ninjas.
     3. Sensei: A sensei can lead ONE or MANY Teams (e.g., across different generations).
     4. Team: A team must be assigned to ONE current Mission.

     * BASIC FIELDS (Excluding relationships):
     - Team: name (e.g., "Team 7")
     - Ninja: name, rank (e.g., "Naruto", "Genin")
     - Sensei: name, chakraNature (e.g., "Kakashi", "Lightning")
     - Mission: title, difficultyRank (e.g., "Escort the Bridge Builder", "C-Rank")
     */

    public static void main(String[] args){
        Ninjas ninja1 = new Ninjas("Naruto", "Genin");
        Ninjas ninja2 = new Ninjas("Sakura", "Genin");
        Ninjas ninja3 = new Ninjas("Sasuke", "Genin");


        Mission mission1 = new Mission("Escort the Bridge Builder", "C-Rank");

        TeamNinja teamSeven = new TeamNinja("Team Seven", new Ninjas[]{ninja1, ninja2, ninja3}, mission1);

        Sensei kakashi = new Sensei("Kakashi", "Lightning", teamSeven);

        teamSeven.setSensei(kakashi);

        teamSeven.print();
    }
}
