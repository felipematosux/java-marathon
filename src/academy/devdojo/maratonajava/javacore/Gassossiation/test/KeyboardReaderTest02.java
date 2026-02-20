package academy.devdojo.maratonajava.javacore.Gassossiation.test;

import java.util.Scanner;

public class KeyboardReaderTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Bem-vindo ao App que prevê o futuro");
        System.out.println("----------------------------------------------------");

        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO:");

        String answer = input.nextLine();
        input.close();

        if (answer.charAt(0) == ' ') {
            System.out.println("SIM!");
        } else {
            System.out.println("NÃO!");
        }





    }
}
