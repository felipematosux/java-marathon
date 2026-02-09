package academy.devdojo.maratonajava.introducao;

public class Exercise02ConditionalStructures {
    public static void main(String[] args) {
        /*
         * EXERCISE 3: Even or Odd
         * * Declare an integer variable with any value.
         * Use an if/else structure and the remainder operator (%) to check
         * if the number is "Even" or "Odd". Print the result.
         */

        System.out.println("---------------------------");
        System.out.println("EXERCISE 3: Even or Odd");
        System.out.println("---------------------------");

        int number = 3;

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even!" );
        } else {
            System.out.println("The number " + number + " is odd!" );
        }

        /*
         * EXERCISE 4: Basic Calculator (Switch Case)
         * * Create two numeric variables (num1 and num2) and a char variable called 'operation'.
         * The 'operation' variable can be '+', '-', '*', or '/'.
         * Use a switch case to perform the correct math operation and print the result.
         */

        System.out.println("---------------------------");
        System.out.println("EXERCISE 4: Basic Calculator (Switch Case)");
        System.out.println("---------------------------");

        double numberOne = 47;
        double numberTwo = 24;
        double sum = 0;
        char operator = '*';

        switch (operator) {
            case '+':
                sum = numberOne + numberTwo;
                break;
            case '-':
                sum = numberOne - numberTwo;
                break;
            case '*':
                sum = numberOne * numberTwo;
                break;
            case '/':
                sum = numberOne / numberTwo;
                break;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println("The result of the operation is: " + sum);
    }
}
