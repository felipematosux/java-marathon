package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    static void main(String[] args) {
        try{
            login();
        }catch(InvalidLoginException e){
            e.printStackTrace();
        }
    }

    private static void login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);

        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("Username: ");
        String insertedUsername = input.nextLine();
        System.out.println("Password: ");
        String insertedPassword = input.nextLine();

        if(!usernameDB.equals(insertedUsername) || !passwordDB.equals(insertedPassword)){
            throw new InvalidLoginException("User or Password are incorrect!");
        }

        System.out.println("Login Successful!");

        input.close();

    }

}
