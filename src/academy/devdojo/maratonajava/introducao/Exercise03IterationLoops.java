package academy.devdojo.maratonajava.introducao;

public class Exercise03IterationLoops {
    public static void main(String[] args) {
        /*
         * EXERCISE 5: Multiplication Table (For Loop)
         * * Choose an integer (e.g., 7).
         * Use a 'for' loop to print the multiplication table for that number from 1 to 10.
         * Expected output format: "7 x 1 = 7", "7 x 2 = 14", etc.
         */

        System.out.println("---------------------------");
        System.out.println("EXERCISE 5: Multiplication Table (For Loop)");

        int number = 6;

        for (int i = 1; i <= 10; i++) {
            int times = number * i;
            System.out.println(number + " * " + i + " = " + times);
        }

        /*
         * EXERCISE 6: Cumulative Sum (While Loop)
         * * Create a program that sums all integers from 1 up to 100.
         * Use a 'while' loop and a counter to accumulate the total.
         * Print only the final sum at the end.
         */

        System.out.println("---------------------------");
        System.out.println("EXERCISE 6: Cumulative Sum (While Loop)");

        int counter = 1;
        int sum = 0;

        while (counter <= 100) {
            sum = sum + counter;
            counter++;
        }
        System.out.println(sum);

    }
}
