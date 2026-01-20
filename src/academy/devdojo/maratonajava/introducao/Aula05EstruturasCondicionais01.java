package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[]args) {
        int age = 17;
        boolean isLegal = age >=18;

        if(isLegal) {
            System.out.println("You can drink alcohol!");
        } else {
            System.out.println("You can't drink alcohol!");
        }

        int accountBalance = 500000;

        if(accountBalance < 50000){
            System.out.println("Is better for You to take the bus!");
        } else if(accountBalance < 100000 && accountBalance >= 50000) {
            System.out.println("You can buy a Prius!");
        } else if(accountBalance > 150000 && accountBalance <= 500000) {
            System.out.println("You can buy a Porsche!");
        } else {
            System.out.println("You can buy ANYTHING You want!");
        }
    }
}
