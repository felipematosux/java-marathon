package academy.devdojo.maratonajava.introducao;

/*
    Exercise:

    Create variables to the fields showed above between <> and print the message:

    I, <name>, living in the address <address>,
    agreed that I received my salary of <salary>, in this date <date>.
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Felipe Matos";
        String address = "3522 2nd Avenue S, Fargo, North Dakota";
        double salary = 3562.58;
        String date = "12/01/2026";
        String relatory = "I, " + nome + ", living in the address, " + address + ". Agreed that I received my salary of $" + salary + ", in this date " + date + ".";

        System.out.println(relatory);
    }
}
