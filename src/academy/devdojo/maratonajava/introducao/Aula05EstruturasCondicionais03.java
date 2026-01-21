package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Donate if salary is bigger than $5000.
        double salary = 2000;
        String donateMessage = "I'll donate $500 to DevDojo!";
        String notDonateMessage = "I won't donate to DevDojo! Maybe one day.";
        String result = salary >= 5000 ? donateMessage : notDonateMessage;
        System.out.println(result);
    }
}
