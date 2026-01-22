package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Using switch and given the values 1 till 7, print if it's a weekday of weekend;
        // Consider 1 as sunday.

        byte day = 4;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Error! This is not a valid number!");
                break;
        }
    }
}
