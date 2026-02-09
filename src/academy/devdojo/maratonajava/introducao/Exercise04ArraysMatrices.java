package academy.devdojo.maratonajava.introducao;

import java.util.Arrays;

public class Exercise04ArraysMatrices {
    public static void main(String[] args) {
        /*
         * EXERCISE 7: Find the Maximum Value
         * * Create an integer array with 5 unordered values (e.g., {12, 5, 30, 8, 1}).
         * Use a loop (for or for-each) to iterate through the array and find the highest number.
         * Print the maximum value found.
         */

        System.out.println("---------------------------");
        System.out.println("EXERCISE 7: Find the Maximum Value");

        int[] newValues = new int[]{112, 45, 30, 8, 1};
        int hightestValue = 0;

        for (int i = 0; i < newValues.length; i++) {
            if (newValues[i] > hightestValue) {
                hightestValue = newValues[i];
            }
        }

        System.out.println("The highest value is " + hightestValue);

        /*
         * EXERCISE 8: Matrix Board (2D Array)
         * * Declare a 2x2 String matrix to represent a small board.
         * Manually fill the positions with "X" or "O".
         * Use nested loops (a loop inside another) to print the matrix in a table format.
         */

        System.out.println("---------------------------");
        System.out.println("EXERCISE 8: Matrix Board (2D Array)");

        char[][] board = new char[][] {{'X', 'O'},{'X', 'O'}};
        for(char[] games : board) {
            for(char game : games) {
                System.out.print(game + " ");
            }
            System.out.println();
        }
    }
}
